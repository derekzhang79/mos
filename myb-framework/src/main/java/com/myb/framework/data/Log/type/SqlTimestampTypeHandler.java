package com.myb.framework.data.Log.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SqlTimestampTypeHandler extends BaseTypeHandler<Timestamp> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Timestamp parameter, JdbcType jdbcType) throws SQLException {
		ps.setTimestamp(i, parameter);
	}

	@Override
	public Timestamp getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return rs.getTimestamp(columnName);
	}

	@Override
	public Timestamp getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return rs.getTimestamp(columnIndex);
	}

	@Override
	public Timestamp getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return cs.getTimestamp(columnIndex);
	}

	@Override
	public void appendLog(StringBuilder builder, Timestamp parameter, DatabaseDialect dialect) {
		if (DatabaseDialect.MYSQL == dialect) {
			builder.append('\'');
			builder.append((null != parameter) ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(parameter) : null);
			builder.append('\'');
		}
	}
}
