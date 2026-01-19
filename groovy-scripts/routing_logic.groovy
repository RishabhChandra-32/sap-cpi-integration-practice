// Sample Groovy routing logic for SAP CPI
if (message.getHeaders().get("OrderType") == "EXPRESS") {
    message.setProperty("route", "priority")
} else {
    message.setProperty("route", "standard")
}
