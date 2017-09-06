package pojo;

import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
 

public class Provider {

	//proContact proPhone proCode
	private Integer id;
	
	@NotEmpty(message="供应商名称不能为空！")
	private String proName;
	@NotEmpty(message="供应商编码不能为空！")
	private String proCode;	
	private String proDesc;
	@NotEmpty(message="联系人不能为空！")
	private String proContact;
	//@Pattern("1\d{10}",message="请输入正确格式的手机号！")
	private String proPhone;
	 
	private String proAddress;
	private String proFax;
	private Integer createdBy;
	private Integer modifyBy;
	private Date birthday;
	private Date creationDate;
	private Date modifyDate;
	//使用多文件上传所用的地址
	private String imageLoad;
	private String imagesPath;
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getImageLoad() {
		return imageLoad;
	}
	public void setImageLoad(String imageLoad) {
		this.imageLoad = imageLoad;
	}
	public String getImagesPath() {
		return imagesPath;
	}
	public void setImagesPath(String imagesPath) {
		this.imagesPath = imagesPath;
	}
	 
	
}
