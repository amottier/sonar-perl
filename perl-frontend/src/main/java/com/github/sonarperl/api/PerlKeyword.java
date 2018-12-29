package com.github.sonarperl.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

public enum PerlKeyword implements TokenType {

    ABS("abs"),
    ACCEPT("accept"),
    ALARM("alarm"),
    ATAN2("atan2"),
    BEGIN("BEGIN"),
    BIND("bind"),
    BINMODE("binmode"),
    BLESS("bless"),
    CALLER("caller"),
    CHDIR("chdir"),
    CHECK("CHECK"),
    CHMOD("chmod"),
    CHOMP("chomp"),
    CHOP("chop"),
    CHOWN("chown"),
    CHR("chr"),
    CHROOT("chroot"),
    CLOSE("close"),
    CLOSEDIR("closedir"),
    CONNECT("connect"),
    CONTINUE("continue"),
    COS("cos"),
    CRYPT("crypt"),
    DBMCLOSE("dbmclose"),
    DBMOPEN("dbmopen"),
    DEFAULT("default"),
    DEFINED("defined"),
    DELETE("delete"),
    DIE("die"),
    DO("do"),
    DUMP("dump"),
    EACH("each"),
    ELSE("else"),
    ELSIF("elsif"),
    END("END"),
    ENDGRENT("endgrent"),
    ENDHOSTENT("endhostent"),
    ENDNETENT("endnetent"),
    ENDPROTOENT("endprotoent"),
    ENDPWENT("endpwent"),
    ENDSERVENT("endservent"),
    EOF("eof"),
    EVAL("eval"),
    EXEC("exec"),
    EXISTS("exists"),
    EXIT("exit"),
    EXP("exp"),
    FCNTL("fcntl"),
    FILENO("fileno"),
    FLOCK("flock"),
    FOR("for"),
    FOREACH("foreach"),
    FORK("fork"),
    FORMLINE("formline"),
    GETC("getc"),
    GETGRENT("getgrent"),
    GETGRGID("getgrgid"),
    GETGRNAM("getgrnam"),
    GETHOSTBYADDR("gethostbyaddr"),
    GETHOSTBYNAME("gethostbyname"),
    GETHOSTENT("gethostent"),
    GETLOGIN("getlogin"),
    GETNETBYADDR("getnetbyaddr"),
    GETNETBYNAME("getnetbyname"),
    GETNETENT("getnetent"),
    GETPEERNAME("getpeername"),
    GETPGRP("getpgrp"),
    GETPPID("getppid"),
    GETPRIORITY("getpriority"),
    GETPROTOBYNAME("getprotobyname"),
    GETPROTOBYNUMBER("getprotobynumber"),
    GETPROTOENT("getprotoent"),
    GETPWENT("getpwent"),
    GETPWNAM("getpwnam"),
    GETPWUID("getpwuid"),
    GETSERVBYNAME("getservbyname"),
    GETSERVBYPORT("getservbyport"),
    GETSERVENT("getservent"),
    GETSOCKNAME("getsockname"),
    GETSOCKOPT("getsockopt"),
    GIVEN("given"),
    GLOB("glob"),
    GMTIME("gmtime"),
    GOTO("goto"),
    GREP("grep"),
    HEX("hex"),
    IF("if"),
    IMPORT("import"),
    INDEX("index"),
    INIT("INIT"),
    INT("int"),
    IOCTL("ioctl"),
    JOIN("join"),
    KEYS("keys"),
    KILL("kill"),
    LAST("last"),
    LC("lc"),
    LCFIRST("lcfirst"),
    LENGTH("length"),
    LINK("link"),
    LISTEN("listen"),
    LOCAL("local"),
    LOCALTIME("localtime"),
    LOG("log"),
    LSTAT("lstat"),
    MAP("map"),
    MKDIR("mkdir"),
    MSGCTL("msgctl"),
    MSGGET("msgget"),
    MSGRCV("msgrcv"),
    MSGSND("msgsnd"),
    MY("my"),
    NEW("new"),
    NEXT("next"),
    NO("no"),
    OCT("oct"),
    OPEN("open"),
    OPENDIR("opendir"),
    ORD("ord"),
    OUR("our"),
    PACK("pack"),
    PACKAGE("package"),
    PIPE("pipe"),
    POP("pop"),
    POS("pos"),
    PRINT("print"),
    PRINTF("printf"),
    PUSH("push"),
    QUOTEMETA("quotemeta"),
    RAND("rand"),
    READ("read"),
    READDIR("readdir"),
    READLINK("readlink"),
    RECV("recv"),
    REDO("redo"),
    REF("ref"),
    RENAME("rename"),
    REQUIRE("require"),
    RESET("reset"),
    RETURN("return"),
    REVERSE("reverse"),
    REWINDDIR("rewinddir"),
    RINDEX("rindex"),
    RMDIR("rmdir"),
    SAY("say"),
    SCALAR("scalar"),
    SEEK("seek"),
    SEEKDIR("seekdir"),
    SELECT("select"),
    SEMCTL("semctl"),
    SEMGET("semget"),
    SEMOP("semop"),
    SEND("send"),
    SETGRENT("setgrent"),
    SETHOSTENT("sethostent"),
    SETNETENT("setnetent"),
    SETPGRP("setpgrp"),
    SETPRIORITY("setpriority"),
    SETPROTOENT("setprotoent"),
    SETPWENT("setpwent"),
    SETSERVENT("setservent"),
    SETSOCKOPT("setsockopt"),
    SHIFT("shift"),
    SHMCTL("shmctl"),
    SHMGET("shmget"),
    SHMREAD("shmread"),
    SHMWRITE("shmwrite"),
    SHUTDOWN("shutdown"),
    SIN("sin"),
    SLEEP("sleep"),
    SOCKET("socket"),
    SOCKETPAIR("socketpair"),
    SORT("sort"),
    SPLICE("splice"),
    SPLIT("split"),
    SPRINTF("sprintf"),
    SQRT("sqrt"),
    SRAND("srand"),
    STAT("stat"),
    STATE("state"),
    STUDY("study"),
    SUB("sub"),
    SUBSTR("substr"),
    SYMLINK("symlink"),
    SYSCALL("syscall"),
    SYSREAD("sysread"),
    SYSSEEK("sysseek"),
    SYSTEM("system"),
    SYSWRITE("syswrite"),
    TELL("tell"),
    TELLDIR("telldir"),
    TIE("tie"),
    TIED("tied"),
    TIME("time"),
    TIMES("times"),
    TRUNCATE("truncate"),
    UC("uc"),
    UCFIRST("ucfirst"),
    UMASK("umask"),
    UNDEF("undef"),
    UNITCHECK("UNITCHECK"),
    UNLESS("unless"),
    UNLINK("unlink"),
    UNPACK("unpack"),
    UNSHIFT("unshift"),
    UNTIE("untie"),
    UNTIL("until"),
    USE("use"),
    UTIME("utime"),
    VALUES("values"),
    VEC("vec"),
    WAIT("wait"),
    WAITPID("waitpid"),
    WANTARRAY("wantarray"),
    WARN("warn"),
    WHEN("when"),
    WHILE("while"),
    WRITE("write");

    private final String value;

    PerlKeyword(String value) {
        this.value = value;
    }


    @Override
    public String getName() {
        return name();
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean hasToBeSkippedFromAst(AstNode node) {
        return false;
    }

    public static String[] keywordValues() {
        PerlKeyword[] keywordsEnum = PerlKeyword.values();
        String[] keywords = new String[keywordsEnum.length];
        for (int i = 0; i < keywords.length; i++) {
            keywords[i] = keywordsEnum[i].getValue();
        }
        return keywords;
    }

}
