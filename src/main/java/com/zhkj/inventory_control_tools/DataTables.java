package com.zhkj.inventory_control_tools;

public class DataTables {

	private Integer iTotalRecords;// 数据库中的结果总行数
	
	private Integer iTotalDisplayRecords;// 搜索过滤后的总行数
	
	private Integer draw;
	
	private String iDisplayStart = "0";// 起始行数
	
	private String pageDisplayLength = "20";// 页面大小
	
	private String iSortCol_0;// 需要排序的列
	
	private String sSortDir_0;// 排序方式
	
	public Object data;// 结果集
	
	public String queryParams; //查询条件；

	public Integer getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(Integer iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public Integer getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(Integer iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public String getiDisplayStart() {
		return iDisplayStart;
	}

	public void setiDisplayStart(String iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	public String getPageDisplayLength() {
		return pageDisplayLength;
	}

	public void setPageDisplayLength(String pageDisplayLength) {
		this.pageDisplayLength = pageDisplayLength;
	}

	public String getiSortCol_0() {
		return iSortCol_0;
	}

	public void setiSortCol_0(String iSortCol_0) {
		this.iSortCol_0 = iSortCol_0;
	}

	public String getsSortDir_0() {
		return sSortDir_0;
	}

	public void setsSortDir_0(String sSortDir_0) {
		this.sSortDir_0 = sSortDir_0;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(String queryParams) {
		this.queryParams = queryParams;
	}
}
