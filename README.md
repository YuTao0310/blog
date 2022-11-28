# 项目简介
基于SpringBoot的博客系统，包含前台系统和后台系统。
# 技术栈
## 前端 
VUE + Element-UI
## 后端
SpringBoot(IoC + AOP) + MyBatisPlus + JWT + SpringSecurity + Redis + Swagger2 + OSS + EasyExcel
# 功能介绍
## 前端功能
1. 显示热门文章
2. 查询文章分类
3. 查询文章详情
4. 友链查询
5. 用户注册
6. 用户登录
7. 发表评论
8. 统计浏览量
9. 上传头像
10. 记录日志
## 后端功能
1. 发表博文
2. 权限控制
3. 用户控制
4. 角色控制
5. 菜单控制
6. 文章管理
7. 分类管理
8. 标签管理
9. 友链管理
10. 信息导出
# 代码运行
## 前端
**博客前台系统运行**

`cd code/front/blog-vue`

`npm run dev`

**博客后台系统运行**

`cd code/front/vue-admin`

`npm run dev`
## 后端
`cd code/tyblog`

`mvn package -Dmaven.test.skip = true`

**博客前台系统对应代码**

运行taoyu-blog对应的java项目

**博客后台系统对应代码**

运行taoyu-admin对应的java项目
