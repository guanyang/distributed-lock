package org.gy.lock.exception;

import lombok.Getter;

/**
 * 功能描述：
 *
 * @author gy
 * @version 1.0.0
 */
@Getter
public class DistributedLockException extends RuntimeException {

    private static final long serialVersionUID = 303295882885179551L;
    /**
     * 错误码
     */
    private final int code;
    /**
     * 错误详情
     */
    private final String msg;


    public DistributedLockException(LockCodeEnum bizCode) {
        super(bizCode.getMsg());
        this.code = bizCode.getCode();
        this.msg = bizCode.getMsg();
    }

    public DistributedLockException(LockCodeEnum bizCode, String msg) {
        super(msg);
        this.code = bizCode.getCode();
        this.msg = msg;
    }

    public DistributedLockException(LockCodeEnum bizCode, Throwable e) {
        super(e);
        this.code = bizCode.getCode();
        this.msg = bizCode.getMsg();
    }

    public DistributedLockException(LockCodeEnum bizCode, String msg, Throwable e) {
        super(msg, e);
        this.code = bizCode.getCode();
        this.msg = msg;
    }

    public DistributedLockException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public DistributedLockException(Integer code, String msg, Throwable e) {
        super(msg, e);
        this.code = code;
        this.msg = msg;
    }

}
