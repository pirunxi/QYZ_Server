
package lx.gs.pet.msg;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __SSyncPetAttrs__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class SSyncPetAttrs extends __SSyncPetAttrs__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6573227;

	public int getType() {
		return 6573227;
	}

	public int modelid;
	public java.util.HashMap<Integer,Float> attrs;

	public SSyncPetAttrs() {
		attrs = new java.util.HashMap<Integer,Float>();
	}

	public SSyncPetAttrs(int _modelid_, java.util.HashMap<Integer,Float> _attrs_) {
		this.modelid = _modelid_;
		this.attrs = _attrs_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(modelid);
		_os_.compact_uint32(attrs.size());
		for (java.util.Map.Entry<Integer, Float> _e_ : attrs.entrySet()) {
			_os_.marshal(_e_.getKey());
			_os_.marshal(_e_.getValue());
		}
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		modelid = _os_.unmarshal_int();
		for (int size = _os_.uncompact_uint32(); size > 0; --size) {
			int _k_;
			_k_ = _os_.unmarshal_int();
			float _v_;
			_v_ = _os_.unmarshal_float();
			attrs.put(_k_, _v_);
		}
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof SSyncPetAttrs) {
			SSyncPetAttrs _o_ = (SSyncPetAttrs)_o1_;
			if (modelid != _o_.modelid) return false;
			if (!attrs.equals(_o_.attrs)) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += modelid;
		_h_ += attrs.hashCode();
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(modelid).append(",");
		_sb_.append(attrs).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

