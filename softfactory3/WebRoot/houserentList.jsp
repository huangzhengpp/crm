<%--
  author:SONG
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="commons/taglib.jsp"%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>二手房管理</title>
    <%@ include file="commons/meta.jsp"%>
  </head>

  <body>
    <div style="margin: 10px 30px;">
      <a href="#" class="easyui-linkbutton" iconCls="icon-add"
        onclick="emp_obj.showEdit('add')">添加</a>&nbsp;&nbsp;
      <a href="#" class="easyui-linkbutton" iconCls="icon-remove"
        onclick="emp_obj.remove()">删除</a>&nbsp;&nbsp;
      <a href="#" class="easyui-linkbutton" iconCls="icon-edit"
        onclick="emp_obj.showEdit('edit')">修改</a>
      <!-- 新增雇员信息窗口 -->
      <div id="editEmp">

      </div>
      <!-- 雇员列表的工具栏设置 -->
      <div id="searchHouseForm" style="padding: 10px;">
        <div style="padding: 0 0 0 6px;">
          	区域:
          <input type="text" id="ename" class="easyui-textbox"/>
         &nbsp;&nbsp;部门:
          <input id="dept" class="easyui-combobox" name="dept"   
               data-options="editable:false,valueField:'deptno',textField:'dname',url:'deptController_find.html'" />
         
          <a href="#" class="easyui-linkbutton" iconCls="icon-search"
            onclick=emp_obj.search();>查询</a>
        </div>
      </div>

      <!-- 房子列表显示 -->
      <div style="margin-top: 20px;">
        <table id="houseDataGrid">

        </table>

      </div>
    </div>
    <script type="text/javascript">
  $(function() {
    emp_obj = {
      search : function() {//查询
        //获得部门号
        var deptno = $('#dept').combobox('getValue');  
        // alert(deptno);
        $("#houseDataGrid").datagrid(
            "load",
            {
              ename : $.trim($("#ename").val()),
              deptno : deptno
            });
      },remove : function(){
        var rows = $("#houseDataGrid").datagrid("getSelections");
        if(rows.length > 0) {
          $.messager.confirm("消息","确认真的要删除所选的数据吗",function(flag){
            if(flag){
              var ids = [];
              for(var i=0;i<rows.length;i++){
                ids.push(rows[i].empno);
              }
              $.ajax({
                type : "post",
                url : "empController_remove.html",
                data : {
                  ids : ids.join(","),
                },
                beforeSend : function(){
                  $("#houseDataGrid").datagrid("loading");
                },
                success : function(data){
                  if(data) {
                    $("#houseDataGrid").datagrid("loaded");
                    $("#houseDataGrid").datagrid("load");
                    $("#houseDataGrid").datagrid("unselectAll");
                    $.messager.show({
                      title : "提示",
                      msg : data + "个雇员被删除"
                    });
                    $('#dept').combobox('reload');      
                  }
                }
              });
            }
          });
        }else {
          $.messager.alert("警告", "请选中要删除的数据","warning");
        }
      },
      showEdit : function(state){
        var url = "empController_findById.html";
        var info = "";
        var id = 0;
        if(state == 'add') {//新增
          info = "新增雇员信息";
        }else {//修改
          info = "修改雇员信息";
          var rows = $("#houseDataGrid").datagrid("getSelections");
          if(rows.length == 1){
            id = rows[0].empno;
            url += "?empno="+id;
          }else{
            $.messager.alert("警告", "必须选中一行", "warning");
            return;
          }
        }
        $("#editEmp").window({
          title : info,
          width : 550,
          height : 480,
          modal : true,
          minimizable : false,
          href : url,
          onClose : function(){
            $("#houseDataGrid").datagrid(
            "reload");
            $('#dept').combobox('reload');    
          }
        });
      }
    }


    $("#houseDataGrid").datagrid( {
      url : "houseController_rent_list.html",
      title : "房屋列表",
      fitColumns : true,
      striped : true,
      rownumbers : true,
      columns : [ [ {
        field : "hid",
        title : "序号",
        width : 100,
        sortable : true
      }, {
        field : "houseArea",
        title : "面积",
        width : 100,
        sortable : true
      } , {
        field : "houseAddr",
        title : "地址",
        width : 100,
        sortable : true
      }, {
        field : "housePprice",
        title : "单价",
        width : 100,
        sortable : true
      }, {
        field : "houseHouses",
        title : "楼盘名",
        width : 100,
        sortable : true
      }, {
        field : "houseTprice",
        title : "总价",
        width : 100,
        sortable : true
      }, {
        field : "houseModel",
        title : "户型",
        width : 100,
        sortable : true
      }, {
        field : "houseDecorate",
        title : "装修",
        width : 100,
        sortable : true
      }, {
        field : "houseProfee",
        title : "物业费",
        width : 100,
        sortable : true
      }, {
        field : "houseAge",
        title : "房龄",
        width : 100,
        sortable : true
      }, {
        field : "houseSort",
        title : "房屋类别",
        width : 100,
        sortable : true
      }, {
        field : "houseConfig",
        title : "房屋配置",
        width : 100,
        sortable : true
      }, {
        field : "houseFacility",
        title : "基础设施",
        width : 100,
        sortable : true
      }, {
        field : "houseWay",
        title : "付款方式",
        width : 100,
        sortable : true
      }, {
        field : "houseDirection",
        title : "房子朝向",
        width : 100,
        sortable : true
      }, {
        field : "houseTime",
        title : "录入时间",
        width : 100,
        sortable : true
      } , {
          field : "user",
          title : "置业经理",
          width : 100,
          sortable : true
        } ,{
        field : "op1",
        title : "操作",
        width : 100,
        formatter : function(value, rowData, rowIndex){
          var hid = rowData["hid"];
          return "<a href='#' onclick=getHouse("+hid+")>查看</a>"
        }
      } ] ],
      toolbar : "#searchHouseForm",
      pagination : true,
      pageSize : 5,
      pageList : [ 5, 10, 15, 20, 50 ],
      sortName : "hid",
      sortOrder : "asc",
    });
  });

  //查看指定菜单
  function getEmp(empno){
    $("#editEmp").window({
      title : "查看雇员详情",
      width : 550,
      height : 480,
      modal : true,
      minimizable : false,
      href : "empController_view.html?empno="+empno
    });
  }
</script>
  </body>
</html>
