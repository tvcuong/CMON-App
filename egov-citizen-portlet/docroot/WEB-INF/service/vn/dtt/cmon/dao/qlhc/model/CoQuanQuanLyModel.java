/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.cmon.dao.qlhc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CoQuanQuanLy service. Represents a row in the &quot;CMON_COQUANQUANLY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.cmon.dao.qlhc.model.impl.CoQuanQuanLyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.cmon.dao.qlhc.model.impl.CoQuanQuanLyImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see CoQuanQuanLy
 * @see vn.dtt.cmon.dao.qlhc.model.impl.CoQuanQuanLyImpl
 * @see vn.dtt.cmon.dao.qlhc.model.impl.CoQuanQuanLyModelImpl
 * @generated
 */
public interface CoQuanQuanLyModel extends BaseModel<CoQuanQuanLy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a co quan quan ly model instance should use the {@link CoQuanQuanLy} interface instead.
	 */

	/**
	 * Returns the primary key of this co quan quan ly.
	 *
	 * @return the primary key of this co quan quan ly
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this co quan quan ly.
	 *
	 * @param primaryKey the primary key of this co quan quan ly
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this co quan quan ly.
	 *
	 * @return the ID of this co quan quan ly
	 */
	public long getId();

	/**
	 * Sets the ID of this co quan quan ly.
	 *
	 * @param id the ID of this co quan quan ly
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this co quan quan ly.
	 *
	 * @return the ma of this co quan quan ly
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this co quan quan ly.
	 *
	 * @param ma the ma of this co quan quan ly
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this co quan quan ly.
	 *
	 * @return the ten of this co quan quan ly
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this co quan quan ly.
	 *
	 * @param ten the ten of this co quan quan ly
	 */
	public void setTen(String ten);

	/**
	 * Returns the dia chi of this co quan quan ly.
	 *
	 * @return the dia chi of this co quan quan ly
	 */
	@AutoEscape
	public String getDiaChi();

	/**
	 * Sets the dia chi of this co quan quan ly.
	 *
	 * @param diaChi the dia chi of this co quan quan ly
	 */
	public void setDiaChi(String diaChi);

	/**
	 * Returns the dien thoai of this co quan quan ly.
	 *
	 * @return the dien thoai of this co quan quan ly
	 */
	@AutoEscape
	public String getDienThoai();

	/**
	 * Sets the dien thoai of this co quan quan ly.
	 *
	 * @param dienThoai the dien thoai of this co quan quan ly
	 */
	public void setDienThoai(String dienThoai);

	/**
	 * Returns the email of this co quan quan ly.
	 *
	 * @return the email of this co quan quan ly
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this co quan quan ly.
	 *
	 * @param email the email of this co quan quan ly
	 */
	public void setEmail(String email);

	/**
	 * Returns the fax of this co quan quan ly.
	 *
	 * @return the fax of this co quan quan ly
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this co quan quan ly.
	 *
	 * @param fax the fax of this co quan quan ly
	 */
	public void setFax(String fax);

	/**
	 * Returns the website of this co quan quan ly.
	 *
	 * @return the website of this co quan quan ly
	 */
	@AutoEscape
	public String getWebsite();

	/**
	 * Sets the website of this co quan quan ly.
	 *
	 * @param website the website of this co quan quan ly
	 */
	public void setWebsite(String website);

	/**
	 * Returns the noi bo of this co quan quan ly.
	 *
	 * @return the noi bo of this co quan quan ly
	 */
	public int getNoiBo();

	/**
	 * Sets the noi bo of this co quan quan ly.
	 *
	 * @param noiBo the noi bo of this co quan quan ly
	 */
	public void setNoiBo(int noiBo);

	/**
	 * Returns the phien ban of this co quan quan ly.
	 *
	 * @return the phien ban of this co quan quan ly
	 */
	public long getPhienBan();

	/**
	 * Sets the phien ban of this co quan quan ly.
	 *
	 * @param phienBan the phien ban of this co quan quan ly
	 */
	public void setPhienBan(long phienBan);

	/**
	 * Returns the da xoa of this co quan quan ly.
	 *
	 * @return the da xoa of this co quan quan ly
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this co quan quan ly.
	 *
	 * @param daXoa the da xoa of this co quan quan ly
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the don vi hanh chinh ID of this co quan quan ly.
	 *
	 * @return the don vi hanh chinh ID of this co quan quan ly
	 */
	public Long getDonViHanhChinhId();

	/**
	 * Sets the don vi hanh chinh ID of this co quan quan ly.
	 *
	 * @param donViHanhChinhId the don vi hanh chinh ID of this co quan quan ly
	 */
	public void setDonViHanhChinhId(Long donViHanhChinhId);

	/**
	 * Returns the cap co quan quanly ID of this co quan quan ly.
	 *
	 * @return the cap co quan quanly ID of this co quan quan ly
	 */
	public Long getCapCoQuanQuanlyId();

	/**
	 * Sets the cap co quan quanly ID of this co quan quan ly.
	 *
	 * @param capCoQuanQuanlyId the cap co quan quanly ID of this co quan quan ly
	 */
	public void setCapCoQuanQuanlyId(Long capCoQuanQuanlyId);

	/**
	 * Returns the cha ID of this co quan quan ly.
	 *
	 * @return the cha ID of this co quan quan ly
	 */
	public Long getChaId();

	/**
	 * Sets the cha ID of this co quan quan ly.
	 *
	 * @param chaId the cha ID of this co quan quan ly
	 */
	public void setChaId(Long chaId);

	/**
	 * Returns the nguoi tao of this co quan quan ly.
	 *
	 * @return the nguoi tao of this co quan quan ly
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this co quan quan ly.
	 *
	 * @param nguoiTao the nguoi tao of this co quan quan ly
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the ngay tao of this co quan quan ly.
	 *
	 * @return the ngay tao of this co quan quan ly
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this co quan quan ly.
	 *
	 * @param ngayTao the ngay tao of this co quan quan ly
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the nguoi sua of this co quan quan ly.
	 *
	 * @return the nguoi sua of this co quan quan ly
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this co quan quan ly.
	 *
	 * @param nguoiSua the nguoi sua of this co quan quan ly
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the ngay sua of this co quan quan ly.
	 *
	 * @return the ngay sua of this co quan quan ly
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this co quan quan ly.
	 *
	 * @param ngaySua the ngay sua of this co quan quan ly
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the merchant of this co quan quan ly.
	 *
	 * @return the merchant of this co quan quan ly
	 */
	@AutoEscape
	public String getMerchant();

	/**
	 * Sets the merchant of this co quan quan ly.
	 *
	 * @param merchant the merchant of this co quan quan ly
	 */
	public void setMerchant(String merchant);

	/**
	 * Returns the access code of this co quan quan ly.
	 *
	 * @return the access code of this co quan quan ly
	 */
	@AutoEscape
	public String getAccessCode();

	/**
	 * Sets the access code of this co quan quan ly.
	 *
	 * @param accessCode the access code of this co quan quan ly
	 */
	public void setAccessCode(String accessCode);

	/**
	 * Returns the secure secret of this co quan quan ly.
	 *
	 * @return the secure secret of this co quan quan ly
	 */
	@AutoEscape
	public String getSecureSecret();

	/**
	 * Sets the secure secret of this co quan quan ly.
	 *
	 * @param secureSecret the secure secret of this co quan quan ly
	 */
	public void setSecureSecret(String secureSecret);

	/**
	 * Returns the ma cap so bien nhan of this co quan quan ly.
	 *
	 * @return the ma cap so bien nhan of this co quan quan ly
	 */
	@AutoEscape
	public String getMaCapSoBienNhan();

	/**
	 * Sets the ma cap so bien nhan of this co quan quan ly.
	 *
	 * @param maCapSoBienNhan the ma cap so bien nhan of this co quan quan ly
	 */
	public void setMaCapSoBienNhan(String maCapSoBienNhan);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(CoQuanQuanLy coQuanQuanLy);

	public int hashCode();

	public CacheModel<CoQuanQuanLy> toCacheModel();

	public CoQuanQuanLy toEscapedModel();

	public String toString();

	public String toXmlString();
}