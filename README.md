# designMethodTrain
手写设计模式练习，用一个咖啡厅的例子，学习所有的设计模式

## 工厂模式

> 通过工厂模式，创建咖啡厅的饮品

## 抽象工厂模式

> 通过抽象工厂模式，创建咖啡厅的饮品

## 建造者模式

> 通过建造者模式，创建一份菜单

## 原型模式

> 通过原型模式，复制一杯饮品

## 单例模式

> 单例模式，咖啡厅只能有一个

## 门面模式
1. 用一个门面来统一的处理请求，将复杂的信息归一化

> 例如咖啡厅的前台要负责点单，客人点单的菜品可能存在多种，但都通过前台

## 适配器模式

> 假设这家咖啡厅以前只提供热咖啡，但现在为了拓宽业务，它开始提供冰咖啡。现有的咖啡机只能制作热咖啡，而制作冰咖啡的过程略有不同。但是咖啡厅不想购买新的咖啡机。
> 在这种情况下，可以引入一个“冰咖啡适配器”来适配现有的咖啡机，使其能制作冰咖啡。

## 访问者模式

访问者要解决的核心事项是，在一个稳定的数据结构下，例如用户信息、雇员信息等，增加易变的业务访问逻辑。为了增强扩展性，将这两部分的业务解耦的一种设计模式。
> 咖啡厅的人员分为顾客和员工，顾客和员工都有身份，顾客：VIP或普通顾客，员工：实习工和正式工
> 咖啡厅的人员还有其他属性，顾客有消费金额，员工有工资
> 咖啡厅的访问者包括：老板和游客 老板可以访问身份和名称，而游客只能访问名称

## 桥接模式
桥接模式（Bridge Pattern）是一种结构型设计模式，其目的是“将抽象与实现解耦，使得两者可以独立地变化”。这个模式是为了应对类自身具有两种以上的变化维度时使用的，以避免出现“类爆炸”的问题。在桥接模式中，抽象（Abstraction）和实现（Implementation）不是一体的，而是可以独立扩展。

> 咖啡厅和社团联合举行校园活动
> 校园活动分为问答活动和桌游活动，可以通过咖啡厅和社团两种渠道报名和参加
> 从咖啡厅渠道参加活动可以赠送一杯咖啡，从社团渠道参加可以赠送奖品