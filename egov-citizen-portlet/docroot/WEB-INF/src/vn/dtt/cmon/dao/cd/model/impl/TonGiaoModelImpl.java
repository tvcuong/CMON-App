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

package vn.dtt.cmon.dao.cd.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.cmon.dao.cd.model.TonGiao;
import vn.dtt.cmon.dao.cd.model.TonGiaoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the TonGiao service. Represents a row in the &quot;CMON_TONGIAO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.cmon.dao.cd.model.TonGiaoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TonGiaoImpl}.
 * </p>
 *
 * @author LIEMNN
 * @see TonGiaoImpl
 * @see vn.dtt.cmon.dao.cd.model.TonGiao
 * @see vn.dtt.cmon.dao.cd.model.TonGiaoModel
 * @generated
 */
public class TonGiaoModelImpl extends BaseModelImpl<TonGiao>
	implements TonGiaoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ton giao model instance should use the {@link vn.dtt.cmon.dao.cd.model.TonGiao} interface instead.
	 */
	public static final String TABLE_NAME = "CMON_TONGIAO";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "MA", Types.VARCHAR },
			{ "TEN", Types.VARCHAR },
			{ "NGAYTAO", Types.TIMESTAMP },
			{ "DAXOA", Types.INTEGER },
			{ "NGUOITAO", Types.VARCHAR },
			{ "NGUOISUA", Types.VARCHAR },
			{ "NGAYSUA", Types.TIMESTAMP },
			{ "PHIENBAN", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CMON_TONGIAO (ID LONG not null primary key,MA VARCHAR(75) null,TEN VARCHAR(75) null,NGAYTAO DATE null,DAXOA INTEGER,NGUOITAO VARCHAR(75) null,NGUOISUA VARCHAR(75) null,NGAYSUA DATE null,PHIENBAN LONG)";
	public static final String TABLE_SQL_DROP = "drop table CMON_TONGIAO";
	public static final String ORDER_BY_JPQL = " ORDER BY tonGiao.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMON_TONGIAO.ID ASC";
	public static final String DATA_SOURCE = "egovDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.cmon.dao.cd.model.TonGiao"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.cmon.dao.cd.model.TonGiao"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.cmon.dao.cd.model.TonGiao"),
			true);
	public static long DAXOA_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.cmon.dao.cd.model.TonGiao"));

	public TonGiaoModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return TonGiao.class;
	}

	public String getModelClassName() {
		return TonGiao.class.getName();
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	public String getMa() {
		if (_ma == null) {
			return StringPool.BLANK;
		}
		else {
			return _ma;
		}
	}

	public void setMa(String ma) {
		_ma = ma;
	}

	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public Date getNgayTao() {
		return _ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;
	}

	public int getDaXoa() {
		return _daXoa;
	}

	public void setDaXoa(int daXoa) {
		_columnBitmask |= DAXOA_COLUMN_BITMASK;

		if (!_setOriginalDaXoa) {
			_setOriginalDaXoa = true;

			_originalDaXoa = _daXoa;
		}

		_daXoa = daXoa;
	}

	public int getOriginalDaXoa() {
		return _originalDaXoa;
	}

	public String getNguoiTao() {
		if (_nguoiTao == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiTao;
		}
	}

	public void setNguoiTao(String nguoiTao) {
		_nguoiTao = nguoiTao;
	}

	public String getNguoiSua() {
		if (_nguoiSua == null) {
			return StringPool.BLANK;
		}
		else {
			return _nguoiSua;
		}
	}

	public void setNguoiSua(String nguoiSua) {
		_nguoiSua = nguoiSua;
	}

	public Date getNgaySua() {
		return _ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		_ngaySua = ngaySua;
	}

	public long getPhienBan() {
		return _phienBan;
	}

	public void setPhienBan(long phienBan) {
		_phienBan = phienBan;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TonGiao toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TonGiao)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					TonGiao.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TonGiaoImpl tonGiaoImpl = new TonGiaoImpl();

		tonGiaoImpl.setId(getId());
		tonGiaoImpl.setMa(getMa());
		tonGiaoImpl.setTen(getTen());
		tonGiaoImpl.setNgayTao(getNgayTao());
		tonGiaoImpl.setDaXoa(getDaXoa());
		tonGiaoImpl.setNguoiTao(getNguoiTao());
		tonGiaoImpl.setNguoiSua(getNguoiSua());
		tonGiaoImpl.setNgaySua(getNgaySua());
		tonGiaoImpl.setPhienBan(getPhienBan());

		tonGiaoImpl.resetOriginalValues();

		return tonGiaoImpl;
	}

	public int compareTo(TonGiao tonGiao) {
		int value = 0;

		if (getId() < tonGiao.getId()) {
			value = -1;
		}
		else if (getId() > tonGiao.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TonGiao tonGiao = null;

		try {
			tonGiao = (TonGiao)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tonGiao.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TonGiaoModelImpl tonGiaoModelImpl = this;

		tonGiaoModelImpl._originalDaXoa = tonGiaoModelImpl._daXoa;

		tonGiaoModelImpl._setOriginalDaXoa = false;

		tonGiaoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TonGiao> toCacheModel() {
		TonGiaoCacheModel tonGiaoCacheModel = new TonGiaoCacheModel();

		tonGiaoCacheModel.id = getId();

		tonGiaoCacheModel.ma = getMa();

		String ma = tonGiaoCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			tonGiaoCacheModel.ma = null;
		}

		tonGiaoCacheModel.ten = getTen();

		String ten = tonGiaoCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			tonGiaoCacheModel.ten = null;
		}

		Date ngayTao = getNgayTao();

		if (ngayTao != null) {
			tonGiaoCacheModel.ngayTao = ngayTao.getTime();
		}
		else {
			tonGiaoCacheModel.ngayTao = Long.MIN_VALUE;
		}

		tonGiaoCacheModel.daXoa = getDaXoa();

		tonGiaoCacheModel.nguoiTao = getNguoiTao();

		String nguoiTao = tonGiaoCacheModel.nguoiTao;

		if ((nguoiTao != null) && (nguoiTao.length() == 0)) {
			tonGiaoCacheModel.nguoiTao = null;
		}

		tonGiaoCacheModel.nguoiSua = getNguoiSua();

		String nguoiSua = tonGiaoCacheModel.nguoiSua;

		if ((nguoiSua != null) && (nguoiSua.length() == 0)) {
			tonGiaoCacheModel.nguoiSua = null;
		}

		Date ngaySua = getNgaySua();

		if (ngaySua != null) {
			tonGiaoCacheModel.ngaySua = ngaySua.getTime();
		}
		else {
			tonGiaoCacheModel.ngaySua = Long.MIN_VALUE;
		}

		tonGiaoCacheModel.phienBan = getPhienBan();

		return tonGiaoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", daXoa=");
		sb.append(getDaXoa());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", nguoiSua=");
		sb.append(getNguoiSua());
		sb.append(", ngaySua=");
		sb.append(getNgaySua());
		sb.append(", phienBan=");
		sb.append(getPhienBan());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.cmon.dao.cd.model.TonGiao");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daXoa</column-name><column-value><![CDATA[");
		sb.append(getDaXoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiSua</column-name><column-value><![CDATA[");
		sb.append(getNguoiSua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySua</column-name><column-value><![CDATA[");
		sb.append(getNgaySua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phienBan</column-name><column-value><![CDATA[");
		sb.append(getPhienBan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TonGiao.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TonGiao.class
		};
	private long _id;
	private String _ma;
	private String _ten;
	private Date _ngayTao;
	private int _daXoa;
	private int _originalDaXoa;
	private boolean _setOriginalDaXoa;
	private String _nguoiTao;
	private String _nguoiSua;
	private Date _ngaySua;
	private long _phienBan;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private TonGiao _escapedModelProxy;
}