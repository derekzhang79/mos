package com.myb.mos.enums;

/**
 * Created by boss on 2016/9/23.
 */
public class StatusEnum{
    public enum isPublicStatusEnum{
        PUBLIC_SEA(1,"公海"),
        PRIVATE_SEA(0,"私海");
        private int code;
        private String name;
        isPublicStatusEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
    public enum isLinkStatusEnum{
        IS_LINK(1,"连锁"),
        IS_NOT_LINK(0,"非连锁");
        private int code;
        private String name;
        isLinkStatusEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
    public enum isAreaStatusEnum{
        IS_AREA(1,"非区域"),
        IS_NOT_AREA(0,"区域内");
        private int code;
        private String name;
        isAreaStatusEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
    public enum isFinishStatusEnum{
        IS_FINISH(1,"签单"),
        IS_NOT_FINISH(0,"未签单");
        private int code;
        private String name;
        isFinishStatusEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
    public enum isOtherAppStatusEnum{
        IS_OTHER_APP(1,"有"),
        IS_NOT_OTHER_APP(0,"无");
        private int code;
        private String name;
        isOtherAppStatusEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
    public enum dutyTypeEnum{
        BOSS(1,"老板"),
        LEADER(2,"店长"),
        FRONT(3,"前台"),
        WORKER(4,"服务员"),
        ELSE(5,"其他");
        private int code;
        private String name;
        dutyTypeEnum(int code, String name) {}
        public int getCode() {
            return this.code;
        }
        public String getName() {
            return this.name;
        }
    }
}
