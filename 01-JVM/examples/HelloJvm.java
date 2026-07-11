public class HelloJvm {
    static class TelemetryGateway {
        private final String gatewayId;

        TelemetryGateway(String gatewayId) {
            this.gatewayId = gatewayId;
        }
    }

    public static void main(String[] args) {
        TelemetryGateway gateway1 = new TelemetryGateway("edge-01");
        TelemetryGateway gateway2 = gateway1;

        System.out.println(gateway1 == gateway2);

        gateway1 = null;

        System.out.println(gateway2 != null);
    }
}
