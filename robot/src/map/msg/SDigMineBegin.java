
package map.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SDigMineBegin__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SDigMineBegin extends __SDigMineBegin__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6684824;

	public int getType() {
		return 6684824;
	}

	public long mineagentid;

	public SDigMineBegin() {
	}

	public SDigMineBegin(long _mineagentid_) {
		this.mineagentid = _mineagentid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(mineagentid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		mineagentid = _os_.unmarshal_long();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SDigMineBegin) {
			SDigMineBegin _o_ = (SDigMineBegin)_o1_;
			if (mineagentid != _o_.mineagentid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)mineagentid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(mineagentid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(SDigMineBegin _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(mineagentid - _o_.mineagentid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

