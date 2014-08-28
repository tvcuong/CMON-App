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
 * The base model interface for the QuocGia service. Represents a row in the &quot;CMON_QUOCGIA&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.cmon.dao.qlhc.model.impl.QuocGiaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.cmon.dao.qlhc.model.impl.QuocGiaImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see QuocGia
 * @see vn.dtt.cmon.dao.qlhc.model.impl.QuocGiaImpl
 * @see vn.dtt.cmon.dao.qlhc.model.impl.QuocGiaModelImpl
 * @generated
 */
public interface QuocGiaModel extends BaseModel<QuocGia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a quoc gia model instance should use the {@link QuocGia} interface instead.
	 */

	/**
	 * Returns the primary key of this quoc gia.
	 *
	 * @return the primary key of this quoc gia
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this quoc gia.
	 *
	 * @param primaryKey the primary key of this quoc gia
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this quoc gia.
	 *
	 * @return the ID of this quoc gia
	 */
	public long getId();

	/**
	 * Sets the ID of this quoc gia.
	 *
	 * @param id the ID of this quoc gia
	 */
	public void setId(long id);

	/**
	 * Returns the ma of this quoc gia.
	 *
	 * @return the ma of this quoc gia
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this quoc gia.
	 *
	 * @param ma the ma of this quoc gia
	 */
	public void setMa(String ma);

	/**
	 * Returns the ten of this quoc gia.
	 *
	 * @return the ten of this quoc gia
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this quoc gia.
	 *
	 * @param ten the ten of this quoc gia
	 */
	public void setTen(String ten);

	/**
	 * Returns the ngay tao of this quoc gia.
	 *
	 * @return the ngay tao of this quoc gia
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this quoc gia.
	 *
	 * @param ngayTao the ngay tao of this quoc gia
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the ngay sua of this quoc gia.
	 *
	 * @return the ngay sua of this quoc gia
	 */
	public Date getNgaySua();

	/**
	 * Sets the ngay sua of this quoc gia.
	 *
	 * @param ngaySua the ngay sua of this quoc gia
	 */
	public void setNgaySua(Date ngaySua);

	/**
	 * Returns the da xoa of this quoc gia.
	 *
	 * @return the da xoa of this quoc gia
	 */
	public int getDaXoa();

	/**
	 * Sets the da xoa of this quoc gia.
	 *
	 * @param daXoa the da xoa of this quoc gia
	 */
	public void setDaXoa(int daXoa);

	/**
	 * Returns the nguoi tao of this quoc gia.
	 *
	 * @return the nguoi tao of this quoc gia
	 */
	@AutoEscape
	public String getNguoiTao();

	/**
	 * Sets the nguoi tao of this quoc gia.
	 *
	 * @param nguoiTao the nguoi tao of this quoc gia
	 */
	public void setNguoiTao(String nguoiTao);

	/**
	 * Returns the nguoi sua of this quoc gia.
	 *
	 * @return the nguoi sua of this quoc gia
	 */
	@AutoEscape
	public String getNguoiSua();

	/**
	 * Sets the nguoi sua of this quoc gia.
	 *
	 * @param nguoiSua the nguoi sua of this quoc gia
	 */
	public void setNguoiSua(String nguoiSua);

	/**
	 * Returns the phien ban of this quoc gia.
	 *
	 * @return the phien ban of this quoc gia
	 */
	public int getPhienBan();

	/**
	 * Sets the phien ban of this quoc gia.
	 *
	 * @param phienBan the phien ban of this quoc gia
	 */
	public void setPhienBan(int phienBan);

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

	public int compareTo(QuocGia quocGia);

	public int hashCode();

	public CacheModel<QuocGia> toCacheModel();

	public QuocGia toEscapedModel();

	public String toString();

	public String toXmlString();
}