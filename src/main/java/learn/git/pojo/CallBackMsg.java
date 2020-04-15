package learn.git.pojo;

public class CallBackMsg {

	private Object obj;
	private Integer status_code;
	private String status;
	private String msg;
	
	public CallBackMsg(Builder builder){
		this.obj = builder.obj;
		this.status_code = builder.status_code;
		this.status = builder.status;
		this.msg = builder.msg;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Integer getStatus_code() {
		return status_code;
	}
	public void setStatus_code(Integer status_code) {
		this.status_code = status_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static class Builder{
		private Object obj;
		private Integer status_code;
		private String status;
		private String msg;
		
		public Builder(){
			super();
		}
		public Builder object(Object obj){
			this.obj = obj;
			return this;
		}
		
		public Builder statusCode(Integer status_code){
			this.status_code = status_code;
			return this;
		}
		
		public Builder status(String status){
			this.status = status;
			return this;
		}
		
		public Builder msg(String msg){
			this.msg = msg;
			return this;
		}
		
		public CallBackMsg build(){
			return new CallBackMsg(this);
		}
	}
}
