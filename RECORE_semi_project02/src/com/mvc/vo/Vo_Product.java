package com.mvc.vo;

import java.sql.Date;
import java.util.List;

public class Vo_Product {

	private int prod_no; //상품 번호
	private int prod_catd; //카테고리 번호
	private String prod_front_img; //상품 대표이미지
	private String prod_name; //상품명
	private String prod_brand; //브랜드
	private int prod_price; //가격
	private String prod_content; //내용
	private int prod_con_count; //내용 카운트
	private String prod_dc_yn; //할인여부
	private double prod_dc; //할인율
	private Date prod_regdate; //작성날짜
	private List<Vo_Prod_option> plist; //상품 옵션 리스트로 관리

	public Vo_Product() {
		super();
	}

	public Vo_Product(int prod_no, int prod_catd, String prod_front_img, String prod_name, String prod_brand,
			int prod_price, String prod_content, int prod_con_count, String prod_dc_yn, double prod_dc,
			Date prod_regdate, List<Vo_Prod_option> plist) {
		super();
		this.prod_no = prod_no;
		this.prod_catd = prod_catd;
		this.prod_front_img = prod_front_img;
		this.prod_name = prod_name;
		this.prod_brand = prod_brand;
		this.prod_price = prod_price;
		this.prod_content = prod_content;
		this.prod_con_count = prod_con_count;
		this.prod_dc_yn = prod_dc_yn;
		this.prod_dc = prod_dc;
		this.prod_regdate = prod_regdate;
		this.plist = plist;
	}

	public int getProd_no() {
		return prod_no;
	}

	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}

	public int getProd_catd() {
		return prod_catd;
	}

	public void setProd_catd(int prod_catd) {
		this.prod_catd = prod_catd;
	}

	public String getProd_front_img() {
		return prod_front_img;
	}

	public void setProd_front_img(String prod_front_img) {
		this.prod_front_img = prod_front_img;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_brand() {
		return prod_brand;
	}

	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_content() {
		return prod_content;
	}

	public void setProd_content(String prod_content) {
		this.prod_content = prod_content;
	}

	public int getProd_con_count() {
		return prod_con_count;
	}

	public void setProd_con_count(int prod_con_count) {
		this.prod_con_count = prod_con_count;
	}

	public String getProd_dc_yn() {
		return prod_dc_yn;
	}

	public void setProd_dc_yn(String prod_dc_yn) {
		this.prod_dc_yn = prod_dc_yn;
	}

	public double getProd_dc() {
		return prod_dc;
	}

	public void setProd_dc(double prod_dc) {
		this.prod_dc = prod_dc;
	}

	public Date getProd_regdate() {
		return prod_regdate;
	}

	public void setProd_regdate(Date prod_regdate) {
		this.prod_regdate = prod_regdate;
	}

	public List<Vo_Prod_option> getPlist() {
		return plist;
	}

	public void setPlist(List<Vo_Prod_option> plist) {
		this.plist = plist;
	}

	@Override
	public String toString() {
		return "Vo_Product [prod_no=" + prod_no + ", prod_catd=" + prod_catd + ", prod_front_img=" + prod_front_img
				+ ", prod_name=" + prod_name + ", prod_brand=" + prod_brand + ", prod_price=" + prod_price
				+ ", prod_content=" + prod_content + ", prod_con_count=" + prod_con_count + ", prod_dc_yn=" + prod_dc_yn
				+ ", prod_dc=" + prod_dc + ", prod_regdate=" + prod_regdate + ", plist=" + plist + "]";
	}

}
