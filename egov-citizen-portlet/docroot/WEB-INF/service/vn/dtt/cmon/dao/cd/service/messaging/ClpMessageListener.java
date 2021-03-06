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

package vn.dtt.cmon.dao.cd.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.cmon.dao.cd.service.ClpSerializer;
import vn.dtt.cmon.dao.cd.service.CongDanLocalServiceUtil;
import vn.dtt.cmon.dao.cd.service.DanTocLocalServiceUtil;
import vn.dtt.cmon.dao.cd.service.DoiTuongSuDungLocalServiceUtil;
import vn.dtt.cmon.dao.cd.service.GioiTinhLocalServiceUtil;
import vn.dtt.cmon.dao.cd.service.TonGiaoLocalServiceUtil;
import vn.dtt.cmon.dao.cd.service.YeuCauDangKyCongDanLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CongDanLocalServiceUtil.clearService();

			DanTocLocalServiceUtil.clearService();

			DoiTuongSuDungLocalServiceUtil.clearService();

			GioiTinhLocalServiceUtil.clearService();

			TonGiaoLocalServiceUtil.clearService();

			YeuCauDangKyCongDanLocalServiceUtil.clearService();
		}
	}
}