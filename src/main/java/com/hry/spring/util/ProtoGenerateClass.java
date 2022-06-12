package com.hry.spring.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用cmd模式，执行protoc根据proto生成java类
 * 
 * @author hry
 *
 */
public class ProtoGenerateClass {
	// protoc的目录
	private static final String PROTOC_FILE = "/usr/local/bin/protoc";

	// specifies a directory in which to look for .proto files when resolving import directives
	//	指定解析导入指令时要在其中查找 .proto 文件的目录
	private static final String IMPOR_TPROTO = "/MyProject/protobuf";
	// 生成java类输出目录
	private static final String JAVA_OUT = "/MyProject/protobuf/src/main/java";
	// 指定proto文件
	private static final String protos = "/MyProject/protobuf/src/main/resources/com/hry/spring/proto/simple/firstDemo.proto";
			
	public static void main(String[] args) throws IOException {
		List<String> lCommand = new ArrayList<String>();
		lCommand.add(PROTOC_FILE);
		lCommand.add("-I=" + IMPOR_TPROTO );
		lCommand.add("--java_out=" + JAVA_OUT);
		lCommand.add(protos);
		
		Cmd cmd = new Cmd();
		cmd.execute(lCommand);
	}	
	
}
