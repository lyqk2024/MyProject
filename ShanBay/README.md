用于处理扇贝阅读网页的数据，可以将爬取的数据转换为对应内容以比较简洁美观形式呈现的英语短文

-v 1.0
实现了主体功能，可以指定读入文件方式，可在代码

      BufferedWriter bw = new BufferedWriter(new FileWriter("Your File Adress"));

"Your File Adress" 处更换为自己的文件路径以输出,需要确保文件夹已经存在，否则请先自行创建。

指南：

    在扇贝阅读对应网址F12进入控制台，并复制html源码粘贴并保存至文本文件中。运行前注意修改上述保存文件路径,运行后将html源码所在文件路径直接粘贴至控制台回车即可，若输出"数据处理成功~"则为成功。
