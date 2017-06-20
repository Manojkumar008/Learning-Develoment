
/**
 * Hello world!
 *
 *
 */
public class QueueCalss
{

    public static void main( String[] args )
    {
        /*
         * 
         * ConnectionFactory factory = new ConnectionFactory(); Connection connection = factory.newConnection(); Channel
         * channel = connection.createChannel(); try {
         * 
         * factory.setHost( rabConf.getHost() ); factory.setPort( rabConf.getPort() ); factory.setUsername(
         * rabConf.getUsername() ); factory.setPassword( rabConf.getPassword() );
         * 
         * factory.setRequestedHeartbeat( 30 ); factory.setConnectionTimeout( 30000 );
         * 
         * String queue = rabConf.getQueue(); boolean durable = false; boolean exclusive = false; boolean autoDelete =
         * false;
         * 
         * channel.queueDeclare( queue, durable, exclusive, autoDelete, null );
         * 
         * String exchangeName = rabConf.getExchange(); String routingKey = rabConf.getRoutingKeyPrefix();
         * 
         * channel.queueDeclare( queue, durable, exclusive, autoDelete, null );
         * 
         * channel.queueBind( queue, exchangeName, routingKey );
         * 
         * /////// LOGGER.info( "to create the Message Queue " ); Collection<RabbitAddress> addresses = new
         * ArrayList<>(); RabbitAddress e = new RabbitAddress( rabConf.getHost(), rabConf.getPort() ); addresses.add( e
         * ); BasicRabbitMqConnection basicRabbitMqConnection = new BasicRabbitMqConnection( addresses,
         * rabConf.getUsername(), rabConf.getPassword() );
         * 
         * Channel channel = basicRabbitMqConnection.getChannel();
         * 
         * RabbitMqPublisher rabbitMqPublisher = basicRabbitMqConnection.getRabbitMqPublisher();
         * rabbitMqPublisher.publish( rabConf.getExchange(), rabConf.getRoutingKeyPrefix(), msg.toString() );
         * 
         * } catch ( Exception e ) {
         * 
         * } finally {
         * 
         * if ( Objects.nonNull( channel ) ) { try { channel.close(); } catch ( Exception e ) {
         * 
         * } } if ( Objects.nonNull( connection ) ) { try { connection.close(); } catch ( Exception e ) {
         * 
         * } }
         * 
         * }
         * 
         */}

}
