# Java-gj（Huijuan MA & Mingge WU ）
草稿
## 项目简介

Java-gj 是一个使用 Java、MySQL 和 Swing 开发的项目，旨在实现一个基本的数据库管理系统。项目采用 Maven 进行依赖管理和构建，数据库选用 MySQL。主要功能包括对产品信息和订单状态的管理，并提供基于 Swing 的用户界面，方便用户交互和数据管理。

## 项目结构

- **src/**: Java 源代码目录，包含项目的主要逻辑代码。
- **pom.xml**: Maven 项目配置文件，用于定义依赖和构建规则。
- **README.md**: 项目文档（你正在阅读的文件）。

## 环境配置

在开始运行项目之前，确保开发环境满足以下要求：

1. **Java JDK 17 或以上版本**
2. **Eclipse IDE**（或者其他兼容的 Java 开发环境）
3. **MySQL 数据库**（版本 8.0 或以上）
4. **Maven**（用于依赖管理和构建）

## 快速开始

1. **克隆仓库**
   ```sh
   git clone https://github.com/Chloe-wu-hub/Java-gj.git
   ```

2. **导入项目**
   在 Eclipse 中选择 `File > Import... > Existing Maven Projects`，选择克隆的仓库所在目录。

3. **配置 MySQL 数据库**
   - 在 MySQL 中创建名为 `products_db` 的数据库。
   - 在 `src/main/resources` 目录下配置数据库连接属性（例如用户名和密码）。

4. **运行项目**
   在 Eclipse 中右键点击主类（例如 `MySQLConnectionTest`），选择 `Run As > Java Application`。

## 主要功能

- **连接数据库**：使用 MySQL 数据库。
- **管理产品和订单**：添加、更新和查询产品和订单的状态。

## 依赖

本项目使用了以下主要依赖：

- **mysql-connector-java 8.0.33**: 用于连接 MySQL 数据库。
- **junit 4.13.2**: 用于测试（**待定**）。

依赖可以通过 Maven 自动下载和管理。

## 如何参与
1. **Fork 这个仓库**。
2. **创建一个分支**来进行你想要的更改。
3. **提交 Pull Request**。

## 许可证

本项目遵循 MIT 许可证。你可以自由地使用、修改和分发此代码，但请保留原作者的版权声明。

## 联系方式

如有任何问题，请通过 GitHub Issues 提交，或者直接联系我：

- **邮箱**: your-email@example.com
- **GitHub**: [Chloe-wu-hub](https://github.com/Chloe-wu-hub)

