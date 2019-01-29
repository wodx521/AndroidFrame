package com.wanou.androidframe.modle;

/**
 * @author wodx521
 * @date on 2018/9/3
 */
public class LoginBean {

    /**
     * token : 6c17ef5c4f125af5d6569c9b0a92b6b9
     * user : {"id":4,"name":"13200000001","phone":"13200000001","money_address":"E1B3E0127B5B78FA3721D3516BB2A5E8","real_name":null,"idcard":null,"code":"L126D1kB","img":null,"photo":null,"status":1,"level":"未激活","level_name":"","time":"1535796433","is_real":0,"wechart":null,"alipay":null,"token":"6c17ef5c4f125af5d6569c9b0a92b6b9","reid":0,"login_time":"1535938825","login_ip":"192.168.1.6","modify_time":null,"apply_real_time":"","real_time":null,"is_bind_bank":0,"account":{"id":4,"uid":4,"reid":0,"account":"0.0000","able_account":"0.0000","frozen_account":"0.0000"},"bank":null,"union":{"id":4,"uid":4,"name":null,"president":null,"qq":null,"wechart":null,"desc":null,"time":"1535796433","team_num":1}}
     */

    private String token;
    private UserBean user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * id : 1
         * name : 张三
         * phone : 13300000001
         * money_address : 3C473A2F4D19953FCE0AC25F6933FB43
         * real_name : zhangsan
         * idcard : null
         * code : J398N7DP
         * img : null
         * status : 1
         * level : 未激活
         * time : 1530525527
         * is_real : 1
         * wechart : zhangsan205
         * alipay : 13300000001
         * token : 59bda8796e4b598fb33271f4b0ac83de
         * reid : 0
         * login_time : 1530865047
         * login_ip : 192.168.1.121
         * modify_time : 1530780880
         * real_time : null
         * is_bind_bank : 1
         * account : {"id":1,"uid":1,"reid":0,"account":"19.75","able_account":"0.00","frozen_account":"0.00"}
         * bank : {"id":1,"uid":1,"name":"zhangsan","address":"郑州市金水区人民路","bank_name":"建设银行","card":"6217002560001022501","phone":2147483647,"time":1530697296}
         * union : {"id":1,"uid":1,"name":"张三的公会","president":null,"qq":12312345,"wechart":"辉煌时刻123","desc":"公会简介公会简介公会简介公会简介公会简介","time":"1530525527","team_num":3}
         */

        private int id;
        private String name;
        private String phone;
        private String money_address;
        private String real_name;
        private String idcard;
        private String code;
        private String img;
        private int status;
        private String level;
        private String time;
        private int is_real;
        private String wechart;
        private String alipay;
        private String token;
        private int reid;
        private String login_time;
        private String login_ip;
        private String modify_time;
        private String real_time;
        private int is_bind_bank;
        private AccountBean account;
//        private BankBean bank;
//        private UnionBean union;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getMoney_address() {
            return money_address;
        }

        public void setMoney_address(String money_address) {
            this.money_address = money_address;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getIs_real() {
            return is_real;
        }

        public void setIs_real(int is_real) {
            this.is_real = is_real;
        }

        public String getWechart() {
            return wechart;
        }

        public void setWechart(String wechart) {
            this.wechart = wechart;
        }

        public String getAlipay() {
            return alipay;
        }

        public void setAlipay(String alipay) {
            this.alipay = alipay;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getReid() {
            return reid;
        }

        public void setReid(int reid) {
            this.reid = reid;
        }

        public String getLogin_time() {
            return login_time;
        }

        public void setLogin_time(String login_time) {
            this.login_time = login_time;
        }

        public String getLogin_ip() {
            return login_ip;
        }

        public void setLogin_ip(String login_ip) {
            this.login_ip = login_ip;
        }

        public String getModify_time() {
            return modify_time;
        }

        public void setModify_time(String modify_time) {
            this.modify_time = modify_time;
        }

        public String getReal_time() {
            return real_time;
        }

        public void setReal_time(String real_time) {
            this.real_time = real_time;
        }

        public int getIs_bind_bank() {
            return is_bind_bank;
        }

        public void setIs_bind_bank(int is_bind_bank) {
            this.is_bind_bank = is_bind_bank;
        }

        public AccountBean getAccount() {
            return account;
        }

        public void setAccount(AccountBean account) {
            this.account = account;
        }

//        public BankBean getBank() {
//            return bank;
//        }
//
//        public void setBank(BankBean bank) {
//            this.bank = bank;
//        }
//
//        public UnionBean getUnion() {
//            return union;
//        }
//
//        public void setUnion(UnionBean union) {
//            this.union = union;
//        }

        public static class AccountBean {
            /**
             * id : 1
             * uid : 1
             * reid : 0
             * account : 19.75
             * able_account : 0.00
             * frozen_account : 0.00
             */

            private int id;
            private int uid;
            private int reid;
            private String account;
            private String able_account;
            private String frozen_account;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getReid() {
                return reid;
            }

            public void setReid(int reid) {
                this.reid = reid;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getAble_account() {
                return able_account;
            }

            public void setAble_account(String able_account) {
                this.able_account = able_account;
            }

            public String getFrozen_account() {
                return frozen_account;
            }

            public void setFrozen_account(String frozen_account) {
                this.frozen_account = frozen_account;
            }
        }
    }
}
