package io.github.msufred.feathericons;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TestMain extends Application {

    private static final double SIZE = 24;

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<FeatherIconView> icons = FXCollections.observableArrayList(
                new FeatherIconView("Activity", new ActivityIcon(SIZE), "activity-icon"),
                new FeatherIconView("Airplay", new AirplayIcon(SIZE), "airplay-icon"),
                new FeatherIconView("Alert Circle", new AlertCircleIcon(SIZE), "alert-circle-icon"),
                new FeatherIconView("Alert Octagon", new AlertOctagonIcon(SIZE), "alert-octagon-icon"),
                new FeatherIconView("Alert Triangle", new AlertTriangleIcon(SIZE), "alert-triangle-icon"),
                new FeatherIconView("Align Center", new AlignCenterIcon(SIZE), "align-center-icon"),
                new FeatherIconView("Align Justify", new AlignJustifyIcon(SIZE), "align-justify-icon"),
                new FeatherIconView("Align Left", new AlignLeftIcon(SIZE), "align-left-icon"),
                new FeatherIconView("Align Right", new AlignRightIcon(SIZE), "align-right-icon"),
                new FeatherIconView("Anchor", new AnchorIcon(SIZE), "anchor-icon"),
                new FeatherIconView("Aperture", new ApertureIcon(SIZE), "aperture-icon"),
                new FeatherIconView("Archive", new ArchiveIcon(SIZE), "archive-icon"),
                new FeatherIconView("Arrow Down", new ArrowDownIcon(SIZE), "arrow-down-icon"),
                new FeatherIconView("Arrow Down Left", new ArrowDownLeftIcon(SIZE), "arrow-down-left-icon"),
                new FeatherIconView("Arrow Down Right", new ArrowDownRightIcon(SIZE), "arrow-down-right-icon"),
                new FeatherIconView("Arrow Left", new ArrowLeftIcon(SIZE), "arrow-left-icon"),
                new FeatherIconView("Arrow Right", new ArrowRightIcon(SIZE), "arrow-right-icon"),
                new FeatherIconView("Arrow Up", new ArrowUpIcon(SIZE), "arrow-up-icon"),
                new FeatherIconView("Arrow Up Left", new ArrowUpLeftIcon(SIZE), "arrow-up-left-icon"),
                new FeatherIconView("Arrow Up Right", new ArrowUpRightIcon(SIZE), "arrow-up-right-icon"),
                new FeatherIconView("Arrow Down Circle", new ArrowDownCircleIcon(SIZE), "arrow-down-circle-icon"),
                new FeatherIconView("Arrow Left Circle", new ArrowLeftCircleIcon(SIZE), "arrow-left-circle-icon"),
                new FeatherIconView("Arrow Right Circle", new ArrowRightCircleIcon(SIZE), "arrow-right-circle-icon"),
                new FeatherIconView("Arrow Up Circle", new ArrowUpCircleIcon(SIZE), "arrow-up-circle-icon"),
                new FeatherIconView("At Sign", new AtSignIcon(SIZE), "at-sign-icon"),
                new FeatherIconView("Award", new AwardIcon(SIZE), "award-icon"),
                new FeatherIconView("Bar Chart", new BarChartIcon(SIZE), "bar-chart-icon"),
                new FeatherIconView("Bar Chart 2", new BarChart2Icon(SIZE), "bar-chart2-icon"),
                new FeatherIconView("Battery", new BatteryIcon(SIZE), "battery-icon"),
                new FeatherIconView("Battery Charging", new BatteryChargingIcon(SIZE), "battery-charging-icon"),
                new FeatherIconView("Bell", new BellIcon(SIZE), "bell-icon"),
                new FeatherIconView("Bell Off", new BellOffIcon(SIZE), "bell-off-icon"),
                new FeatherIconView("Bluetooth", new BluetoothIcon(SIZE), "bluetooth-icon"),
                new FeatherIconView("Bold", new BoldIcon(SIZE), "bold-icon"),
                new FeatherIconView("Book", new BookIcon(SIZE), "book-icon"),
                new FeatherIconView("Bookmark", new BookmarkIcon(SIZE), "bookmark-icon"),
                new FeatherIconView("Book Open", new BookOpenIcon(SIZE), "book-open-icon"),
                new FeatherIconView("Box", new BoxIcon(SIZE), "box-icon"),
                new FeatherIconView("Briefcase", new BriefcaseIcon(SIZE), "briefcase-icon"),
                new FeatherIconView("Calendar", new CalendarIcon(SIZE), "calendar-icon"),
                new FeatherIconView("Camera", new CameraIcon(SIZE), "camera-icon"),
                new FeatherIconView("Camera Off", new CameraOffIcon(SIZE), "camera-off-icon"),
                new FeatherIconView("Cast", new CastIcon(SIZE), "cast-icon"),
                new FeatherIconView("Check", new CheckIcon(SIZE), "check-icon"),
                new FeatherIconView("Check Circle", new CheckCircleIcon(SIZE), "check-circle-icon"),
                new FeatherIconView("Check Square", new CheckSquareIcon(SIZE), "check-square-icon"),
                new FeatherIconView("Chevron Down", new ChevronDownIcon(SIZE), "chevron-down-icon"),
                new FeatherIconView("Chevron Left", new ChevronLeftIcon(SIZE), "chevron-left-icon"),
                new FeatherIconView("Chevron Right", new ChevronRightIcon(SIZE), "chevron-right-icon"),
                new FeatherIconView("Chevron Up", new ChevronUpIcon(SIZE), "chevron-up-icon"),
                new FeatherIconView("Chevrons Down", new ChevronsDownIcon(SIZE), "chevrons-down-icon"),
                new FeatherIconView("Chevrons Left", new ChevronsLeftIcon(SIZE), "chevrons-left-icon"),
                new FeatherIconView("Chevrons Right", new ChevronsRightIcon(SIZE), "chevrons-right-icon"),
                new FeatherIconView("Chevrons Up", new ChevronsUpIcon(SIZE), "chevrons-up-icon"),
                new FeatherIconView("Chrome", new ChromeIcon(SIZE), "chrome-icon"),
                new FeatherIconView("Circle", new CircleIcon(SIZE), "circle-icon"),
                new FeatherIconView("Clipboard", new ClipboardIcon(SIZE), "clipboard-icon"),
                new FeatherIconView("Clock", new ClockIcon(SIZE), "clock-icon"),
                new FeatherIconView("Cloud", new CloudIcon(SIZE), "cloud-icon"),
                new FeatherIconView("Cloud Drizzle", new CloudDrizzleIcon(SIZE), "cloud-drizzle-icon"),
                new FeatherIconView("Cloud Lightning", new CloudLightningIcon(SIZE), "cloud-lightning-icon"),
                new FeatherIconView("Cloud Off", new CloudOffIcon(SIZE), "cloud-off-icon"),
                new FeatherIconView("Cloud Rain", new CloudRainIcon(SIZE), "cloud-rain-icon"),
                new FeatherIconView("Cloud Snow", new CloudSnowIcon(SIZE), "cloud-snow-icon"),
                new FeatherIconView("Code", new CodeIcon(SIZE), "code-icon"),
                new FeatherIconView("Code Pen", new CodePenIcon(SIZE), "code-pen-icon"),
                new FeatherIconView("Code Sandbox", new CodeSandboxIcon(SIZE), "code-sandbox-icon"),
                new FeatherIconView("Coffee", new CoffeeIcon(SIZE), "coffee-icon"),
                new FeatherIconView("Column", new ColumnIcon(SIZE), "column-icon"),
                new FeatherIconView("Command", new CommandIcon(SIZE), "command-icon"),
                new FeatherIconView("Compass", new CompassIcon(SIZE), "compass-icon"),
                new FeatherIconView("Copy", new CopyIcon(SIZE), "copy-icon"),
                new FeatherIconView("Corner Down Left", new CornerDownLeftIcon(SIZE), "corner-down-left-icon"),
                new FeatherIconView("Corner Down Right", new CornerDownRightIcon(SIZE), "corner-down-right-icon"),
                new FeatherIconView("Corner Left Down", new CornerLeftDownIcon(SIZE), "corner-left-down-icon"),
                new FeatherIconView("Corner Left Up", new CornerLeftUpIcon(SIZE), "corner-left-up-icon"),
                new FeatherIconView("Corner Right Down", new CornerRightDownIcon(SIZE), "corner-right-down-icon"),
                new FeatherIconView("Corner Right Up", new CornerRightUpIcon(SIZE), "corner-right-up-icon"),
                new FeatherIconView("Corner Up Left", new CornerUpLeftIcon(SIZE), "corner-up-left-icon"),
                new FeatherIconView("Corner Up Right", new CornerRightUpIcon(SIZE), "corner-right-up-icon"),
                new FeatherIconView("Search", new SearchIcon(SIZE), "search-icon")
        );

        FilteredList<FeatherIconView> filteredList = new FilteredList<>(icons);

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(18));
        flowPane.setHgap(8);
        flowPane.setVgap(8);

        Bindings.bindContent(flowPane.getChildren(), filteredList);

        Label lblIcon = new Label();
        lblIcon.setGraphic(new SearchIcon(14));
        TextField searchField = new TextField();
        searchField.setPromptText("Search Icon");
        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) filteredList.setPredicate(icon -> icon.label.getText().toLowerCase().contains(newValue.toLowerCase()));
            else filteredList.setPredicate(p -> true);
        });
        HBox.setHgrow(searchField, Priority.ALWAYS);
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_LEFT);
        hBox.setSpacing(8);
        hBox.setPadding(new Insets(8));
        hBox.getChildren().addAll(lblIcon, searchField);

        ScrollPane scrollPane = new ScrollPane(flowPane);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        VBox.setVgrow(scrollPane, Priority.ALWAYS);
        VBox root = new VBox();
        root.getChildren().addAll(hBox, scrollPane);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Feather Icons");
        primaryStage.show();
    }

    private static class FeatherIconView extends VBox {
        Label label;
        SVGIcon icon;

        FeatherIconView(String text, SVGIcon icon, String tooltip) {
            label = new Label(text);
            label.setTextAlignment(TextAlignment.CENTER);
            label.setWrapText(true);
            this.icon = icon;

            setAlignment(Pos.CENTER);
            setPadding(new Insets(8));
            setSpacing(8);
            setPrefSize(100, 100);
            setMinSize(100, 100);
            setMaxSize(100, 100);

            getChildren().addAll(icon, label);
            if (tooltip != null) Tooltip.install(this, new Tooltip(tooltip));

            setStyle(
                    "-fx-background-color: white; " +
                    "-fx-background-radius: 4; " +
                    "-fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.2), 3, 0, 0, 0);"
            );
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
