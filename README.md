# Calc_Demo
计算器示例项目，向result.txt中写入“hello”，演示文件层次结构

java源文件全部放在 src文件中

java字节码文件全部放在 bin文件中

run.bat为自动运行测试脚本，使用其它操作系统的同学请自行编写脚本运行程序

### 文件解释：

    /src
	    Main.java (主程序，可以从命令行接收参数)
	    WriteToFile.java (向文件中写入“hello”)
    /bin
	    Main.class(字节码文件)
	    WriteToFile.class(字节码文件)
    /run.bat(自动编译运行全部工程的脚本文件)
    /result.txt（运行run.bat后生成的文件）
    
### 运行方式：

在命令行中运行run.bat文件，所有java文件自动编译运行
