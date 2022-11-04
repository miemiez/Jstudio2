package Day66MySQL14;

public class 事务的作用已经操作方式 {
	/*
	 * 事务：
	 *     事务用于保证数据的一致性，它由一组相关的dml语句组成，该组的dml语句要么全部成功，要么全部失败。
	 *     如：转账就要用事务来处理，用以保证数据的一致性
	 * 
	 * MySQL数据库控制台事务的几个重要操作
	 *     开始一个事务：start transaction
	 *     保存点名--设置保存点：savepoint
	 *     保存点名--回退事务：rollback to
	 *     回退全部事务：rollback
	 *     提交事务，所有的操作生效，不能回退：commit
	 * 
	 * 回退事务
	 *     保存点：
	 *         保存点是事务中点，用于取消部分事务。
	 *     当结束事务时（commit），会自动的删除该事务所定义的所有保存点，当执行回退事务时，通过指定保存点可以回退到指定的点
	 * 
	 * 提交事务
	 *     使用commit语句可以提交事务，当执行了commit语句后，会确认事务的变化，结束事务，删除保存点，释放锁，数据生效。
	 *     当使用commit语句结束事务后，其他会话将可以查看到事务变化后的新数据
	 *     
	 * 事务细节：
	 *     1.如果不开启事务，默认情况下，dml操作是自动提交的，不能回滚
	 *     2.如果开始一个事务，但是并没有创建保存点，可以执行rollback，默认就是回退到事务开始的状态
	 *     3.在事务没有提交之前，可以在事务中创建多个保存点，比如：savepoint a，savepoint b等等
	 *     4.可以在事务没有提交之前，选择回退到哪个保存点
	 *     5.mysql的事务机制，需要inoodb的存储引擎才可以使用，myisam不好使用
	 *     6.开始一个事务：（1）start transaction;   （2）set autocommit = off;
	 */
}
