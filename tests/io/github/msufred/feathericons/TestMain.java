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
                new FeatherIconView("CPU", new CpuIcon(SIZE), "cpu-icon"),
                new FeatherIconView("Credit Card", new CreditCardIcon(SIZE), "credit-card-icon"),
                new FeatherIconView("Crop", new CropIcon(SIZE), "crop-icon"),
                new FeatherIconView("Cross Hair", new CrossHairIcon(SIZE), "cross-hair-icon"),
                new FeatherIconView("Database", new DatabaseIcon(SIZE), "database-icon"),
                new FeatherIconView("Delete", new DeleteIcon(SIZE), "delete-icon"),
                new FeatherIconView("Disc", new DiscIcon(SIZE), "disc-icon"),
                new FeatherIconView("Divide", new DivideIcon(SIZE), "divide-icon"),
                new FeatherIconView("Divide Circle", new DivideCircleIcon(SIZE), "divide-circle-icon"),
                new FeatherIconView("Divide Square", new DivideSquareIcon(SIZE), "divide-square-icon"),
                new FeatherIconView("Dollar", new DollarIcon(SIZE), "dollar-icon"),
                new FeatherIconView("Download", new DownloadIcon(SIZE), "download-icon"),
                new FeatherIconView("Download Cloud", new DownloadCloudIcon(SIZE), "download-cloud-icon"),
                new FeatherIconView("Dribble", new DribbleIcon(SIZE), "dribble-icon"),
                new FeatherIconView("Droplet", new DropletIcon(SIZE), "droplet-icon"),
                new FeatherIconView("Edit", new EditIcon(SIZE), "edit-icon"),
                new FeatherIconView("Edit2", new Edit2Icon(SIZE), "edit2-icon"),
                new FeatherIconView("Edit3", new Edit3Icon(SIZE), "edit3-icon"),
                new FeatherIconView("External Link", new ExternalLinkIcon(SIZE), "external-link-icon"),
                new FeatherIconView("Eye", new EyeIcon(SIZE), "eye-icon"),
                new FeatherIconView("Eye Off", new EyeOffIcon(SIZE), "eye-off-icon"),
                new FeatherIconView("Facebook", new FacebookIcon(SIZE), "facebook-icon"),
                new FeatherIconView("Fast Forward", new FastForwardIcon(SIZE), "fast-forward-icon"),
                new FeatherIconView("Feather", new FeatherIcon(SIZE), "feather-icon"),
                new FeatherIconView("Figma", new FigmaIcon(SIZE), "figma-icon"),
                new FeatherIconView("File", new FileIcon(SIZE), "file-icon"),
                new FeatherIconView("File Minus", new FileMinusIcon(SIZE), "file-minus-icon"),
                new FeatherIconView("File Plus", new FilePlusIcon(SIZE), "file-plus-icon"),
                new FeatherIconView("File Text", new FileTextIcon(SIZE), "file-text-icon"),
                new FeatherIconView("Film", new FilmIcon(SIZE), "film-icon"),
                new FeatherIconView("Filter", new FilterIcon(SIZE), "filter-icon"),
                new FeatherIconView("Flag", new FlagIcon(SIZE), "flag-icon"),
                new FeatherIconView("Folder", new FolderIcon(SIZE), "folder-icon"),
                new FeatherIconView("Folder Minus", new FolderMinusIcon(SIZE), "folder-minus-icon"),
                new FeatherIconView("Folder Plus", new FolderPlusIcon(SIZE), "folder-plus-icon"),
                new FeatherIconView("Framer", new FramerIcon(SIZE), "framer-icon"),
                new FeatherIconView("Frown", new FrownIcon(SIZE), "frown-icon"),
                new FeatherIconView("Gift", new GiftIcon(SIZE), "gift-icon"),
                new FeatherIconView("Git Branch", new GitBranchIcon(SIZE), "git-branch-icon"),
                new FeatherIconView("Git Commit", new GitCommitIcon(SIZE), "git-commit-icon"),
                new FeatherIconView("Github", new GithubIcon(SIZE), "github-icon"),
                new FeatherIconView("Gitlab", new GitlabIcon(SIZE), "gitlab-icon"),
                new FeatherIconView("Git Merge", new GitMergeIcon(SIZE), "git-merge-icon"),
                new FeatherIconView("Git Pull Request", new GitPullRequestIcon(SIZE), "git-pull-request"),
                new FeatherIconView("Globe", new GlobeIcon(SIZE), "globe-icon"),
                new FeatherIconView("Grid", new GridIcon(SIZE), "grid-icon"),
                new FeatherIconView("Hard Drive", new HardDriveIcon(SIZE), "hard-drive-icon"),
                new FeatherIconView("Hash", new HashIcon(SIZE), "hash-icon"),
                new FeatherIconView("Headphone", new HeadphoneIcon(SIZE), "headphone-icon"),
                new FeatherIconView("Heart", new HeartIcon(SIZE), "heart-icon"),
                new FeatherIconView("Help Circle", new HelpCircleIcon(SIZE), "help-circle-icon"),
                new FeatherIconView("Hexagon", new HexagonIcon(SIZE), "hexagon-icon"),
                new FeatherIconView("Home", new HomeIcon(SIZE), "home-icon"),
                new FeatherIconView("Image", new ImageIcon(SIZE), "image-icon"),
                new FeatherIconView("Inbox", new InboxIcon(SIZE), "inbox-icon"),
                new FeatherIconView("Info", new InfoIcon(SIZE), "info-icon"),
                new FeatherIconView("Instagram", new InstagramIcon(SIZE), "instagram-icon"),
                new FeatherIconView("Italic", new ItalicIcon(SIZE), "italic-icon"),
                new FeatherIconView("Key", new KeyIcon(SIZE), "key-icon"),
                new FeatherIconView("Layers", new LayersIcon(SIZE), "layers-icon"),
                new FeatherIconView("Layout", new LayoutIcon(SIZE), "layout-icon"),
                new FeatherIconView("Life Buoy", new LifeBuoyIcon(SIZE), "life-buoy-icon"),
                new FeatherIconView("Link", new LinkIcon(SIZE), "link-icon"),
                new FeatherIconView("Link2", new Link2Icon(SIZE), "link2-icon"),
                new FeatherIconView("Linkedin", new LinkedinIcon(SIZE), "linkedin-icon"),
                new FeatherIconView("List", new ListIcon(SIZE), "list-icon"),
                new FeatherIconView("Loader", new LoaderIcon(SIZE), "loader-icon"),
                new FeatherIconView("Lock", new LockIcon(SIZE), "lock-icon"),
                new FeatherIconView("Login", new LogInIcon(SIZE), "login-icon"),
                new FeatherIconView("Logout", new LogOutIcon(SIZE), "logout-icon"),
                new FeatherIconView("Mail", new MailIcon(SIZE), "mail-icon"),
                new FeatherIconView("Map", new MapIcon(SIZE), "map-icon"),
                new FeatherIconView("Map Pin", new MapPinIcon(SIZE), "map-pin-icon"),
                new FeatherIconView("Maximize", new MaximizeIcon(SIZE), "maximize-icon"),
                new FeatherIconView("Maximize2", new Maximize2Icon(SIZE), "maximize2-icon"),
                new FeatherIconView("Meh", new MehIcon(SIZE), "meh-icon"),
                new FeatherIconView("Menu", new MenuIcon(SIZE), "menu-icon"),
                new FeatherIconView("Message Circle", new MessageCircleIcon(SIZE), "message-circle-icon"),
                new FeatherIconView("Message Square", new MessageSquareIcon(SIZE), "message-square-icon"),
                new FeatherIconView("Mic", new MicIcon(SIZE), "mic-icon"),
                new FeatherIconView("Mic Off", new MicOffIcon(SIZE), "mic-off-icon"),
                new FeatherIconView("Minimize", new MinimizeIcon(SIZE), "minimize-icon"),
                new FeatherIconView("Minimize2", new Minimize2Icon(SIZE), "minimize2-icon"),
                new FeatherIconView("Minus", new MinusIcon(SIZE), "minus-icon"),
                new FeatherIconView("Minus Circle", new MinusCircleIcon(SIZE), "minus-circle-icon"),
                new FeatherIconView("Minus Square", new MinusSquareIcon(SIZE), "minus-square-icon"),
                new FeatherIconView("Monitor", new MonitorIcon(SIZE), "monitor-icon"),
                new FeatherIconView("Moon", new MoonIcon(SIZE), "moon-icon"),
                new FeatherIconView("More Horizontal", new MoreHorizontalIcon(SIZE), "more-horizontal-icon"),
                new FeatherIconView("More Vertical", new MoreVerticalIcon(SIZE), "more-vertical-icon"),
                new FeatherIconView("Mouse Pointer", new MousePointerIcon(SIZE), "mouse-pointer-icon"),
                new FeatherIconView("Move", new MoveIcon(SIZE), "move-icon"),
                new FeatherIconView("Music", new MusicIcon(SIZE), "music-icon"),
                new FeatherIconView("Navigation", new NavigationIcon(SIZE), "navigation-icon"),
                new FeatherIconView("Navigation2", new Navigation2Icon(SIZE), "navigation2-icon"),
                new FeatherIconView("Octagon", new OctagonIcon(SIZE), "octagon-icon"),
                new FeatherIconView("Package", new PackageIcon(SIZE), "package-icon"),
                new FeatherIconView("Paper Clip", new PaperClipIcon(SIZE), "paper-clip-icon"),
                new FeatherIconView("Pause", new PauseIcon(SIZE), "pause-icon"),
                new FeatherIconView("Pause Circle", new PauseCircleIcon(SIZE), "pause-circle-icon"),
                new FeatherIconView("Pen Tool", new PenToolIcon(SIZE), "pen-tool-icon"),
                new FeatherIconView("Percent", new PercentIcon(SIZE), "percent-icon"),
                new FeatherIconView("Phone", new PhoneIcon(SIZE), "phone-icon"),
                new FeatherIconView("Phone Call", new PhoneCallIcon(SIZE), "phone-call-icon"),
                new FeatherIconView("Phone Forwarded", new PhoneForwardedIcon(SIZE), "phone-forwarded-icon"),
                new FeatherIconView("Phone Incoming", new PhoneIncomingIcon(SIZE), "phone-incoming-icon"),
                new FeatherIconView("Phone Missed", new PhoneMissedIcon(SIZE), "phone-missed-icon"),
                new FeatherIconView("Phone Off", new PhoneOffIcon(SIZE), "phone-off-icon"),
                new FeatherIconView("Phone Outgoing", new PhoneOutgoingIcon(SIZE), "phone-outgoing-icon"),
                new FeatherIconView("Pie Chart", new PieChartIcon(SIZE), "pie-chart-icon"),
                new FeatherIconView("Play", new PlayIcon(SIZE), "play-icon"),
                new FeatherIconView("Play Circle", new PlayCircleIcon(SIZE), "play-circle-icon"),
                new FeatherIconView("Plus", new PlusIcon(SIZE), "plus-icon"),
                new FeatherIconView("Plus Circle", new PlusCircleIcon(SIZE), "plus-circle-icon"),
                new FeatherIconView("Plus Square", new PlusSquareIcon(SIZE), "plus-square-icon"),
                new FeatherIconView("Pocket", new PocketIcon(SIZE), "pocket-icon"),
                new FeatherIconView("Power", new PowerIcon(SIZE), "power-icon"),
                new FeatherIconView("Printer", new PrinterIcon(SIZE), "printer-icon"),
                new FeatherIconView("Radio", new RadioIcon(SIZE), "radio-icon"),
                new FeatherIconView("Refresh CCW", new RefreshCcwIcon(SIZE), "refresh-ccw-icon"),
                new FeatherIconView("Refresh CW", new RefreshCwIcon(SIZE), "refresh-cw-icon"),
                new FeatherIconView("Repeat", new RepeatIcon(SIZE), "repeat-icon"),
                new FeatherIconView("Rewind", new RewindIcon(SIZE), "rewind-icon"),
                new FeatherIconView("Rotate CCW", new RotateCcwIcon(SIZE), "rotate-ccw-icon"),
                new FeatherIconView("Rotate CW", new RotateCwIcon(SIZE), "rotate-cw-icon"),
                new FeatherIconView("RSS", new RssIcon(SIZE), "rss-icon"),
                new FeatherIconView("SaveIcon", new SaveIcon(SIZE), "save-icon"),
                new FeatherIconView("Scissors", new ScissorsIcon(SIZE), "scissors-icon"),
                new FeatherIconView("Search", new SearchIcon(SIZE), "search-icon"),
                new FeatherIconView("Send", new SendIcon(SIZE), "send-icon"),
                new FeatherIconView("Server", new ServerIcon(SIZE), "server-icon"),
                new FeatherIconView("Settings", new SettingsIcon(SIZE), "settings-icon"),
                new FeatherIconView("Share", new ShareIcon(SIZE), "share-icon"),
                new FeatherIconView("Share2", new Share2Icon(SIZE), "share2-icon"),
                new FeatherIconView("Shield", new ShieldIcon(SIZE), "shield-icon"),
                new FeatherIconView("Shield2", new Shield2Icon(SIZE), "shield2-icon"),
                new FeatherIconView("Shopping Bag", new ShoppingBagIcon(SIZE), "shopping-bag-icon"),
                new FeatherIconView("Shopping Cart", new ShoppingCartIcon(SIZE), "shopping-cart-icon"),
                new FeatherIconView("Shuffle", new ShuffleIcon(SIZE), "shuffle-icon"),
                new FeatherIconView("Sidebar", new SidebarIcon(SIZE), "sidebar-icon"),
                new FeatherIconView("Skip Back", new SkipBackIcon(SIZE), "skip-back-icon"),
                new FeatherIconView("Skip Forward", new SkipForwardIcon(SIZE), "skip-forward-icon"),
                new FeatherIconView("Slack", new SlackIcon(SIZE), "slack-icon"),
                new FeatherIconView("Slash", new SlashIcon(SIZE), "slash-icon"),
                new FeatherIconView("Sliders", new SlidersIcon(SIZE), "sliders-icon"),
                new FeatherIconView("Smartphone", new SmartphoneIcon(SIZE), "smartphone-icon"),
                new FeatherIconView("Smile", new SmileIcon(SIZE), "smile-icon"),
                new FeatherIconView("Speaker", new SpeakerIcon(SIZE), "speaker-icon"),
                new FeatherIconView("Square", new SquareIcon(SIZE), "square-icon"),
                new FeatherIconView("Star", new StarIcon(SIZE), "star-icon"),
                new FeatherIconView("Stop Circle", new StopCircleIcon(SIZE), "stop-circle-icon"),
                new FeatherIconView("Sun", new SunIcon(SIZE), "sun-icon"),
                new FeatherIconView("Sunrise", new SunriseIcon(SIZE), "sunrise-icon"),
                new FeatherIconView("Sunset", new SunsetIcon(SIZE), "sunset-icon"),
                new FeatherIconView("Table", new TableIcon(SIZE), "table-icon"),
                new FeatherIconView("Tablet", new TabletIcon(SIZE), "tablet-icon"),
                new FeatherIconView("Tag", new TagIcon(SIZE), "tag-icon"),
                new FeatherIconView("Target", new TargetIcon(SIZE), "target-icon"),
                new FeatherIconView("Terminal", new TerminalIcon(SIZE), "terminal-icon"),
                new FeatherIconView("Thermometer", new ThermometerIcon(SIZE), "thermometer-icon"),
                new FeatherIconView("Thumbs Down", new ThumbsDownIcon(SIZE), "thumbs-down-icon"),
                new FeatherIconView("Toggle Left", new ToggleLeftIcon(SIZE), "toggle-left-icon"),
                new FeatherIconView("Toggle Right", new ToggleRightIcon(SIZE), "toggle-right-icon"),
                new FeatherIconView("Tool", new ToolIcon(SIZE), "tool-icon"),
                new FeatherIconView("Trash", new TrashIcon(SIZE), "trash-icon"),
                new FeatherIconView("Trash2", new Trash2Icon(SIZE), "trash2-icon"),
                new FeatherIconView("Trello", new TrelloIcon(SIZE), "trello-icon"),
                new FeatherIconView("Trending Down", new TrendingDownIcon(SIZE), "trending-down-icon"),
                new FeatherIconView("Trending Up", new TrendingUpIcon(SIZE), "trending-up-icon"),
                new FeatherIconView("Triangle", new TriangleIcon(SIZE), "triangle-icon"),
                new FeatherIconView("Truck", new TruckIcon(SIZE), "truck-icon"),
                new FeatherIconView("TV", new TvIcon(SIZE), "tv-icon"),
                new FeatherIconView("Twitch", new TwitchIcon(SIZE), "twitch-icon"),
                new FeatherIconView("Twitter", new TwitterIcon(SIZE), "twitter-icon"),
                new FeatherIconView("Type", new TypeIcon(SIZE), "type-icon"),
                new FeatherIconView("Umbrella", new UmbrellaIcon(SIZE), "umbrella-icon"),
                new FeatherIconView("Underline", new UnderlineIcon(SIZE), "underline-icon"),
                new FeatherIconView("Unlock", new UnlockIcon(SIZE), "unlock-icon"),
                new FeatherIconView("Upload", new UploadIcon(SIZE), "upload-icon"),
                new FeatherIconView("Upload Cloud", new UploadCloud(SIZE), "upload-cloud-icon"),
                new FeatherIconView("User", new UserIcon(SIZE), "user-icon"),
                new FeatherIconView("User Check", new UserCheckIcon(SIZE), "user-check-icon"),
                new FeatherIconView("User Minus", new UserMinusIcon(SIZE), "user-minus-icon"),
                new FeatherIconView("User Plus", new UserPlusIcon(SIZE), "user-plus-icon"),
                new FeatherIconView("Users", new UsersIcon(SIZE), "users-icon"),
                new FeatherIconView("User X", new UserXIcon(SIZE), "user-x-icon"),
                new FeatherIconView("Video", new VideoIcon(SIZE), "video-icon"),
                new FeatherIconView("Video Off", new VideoOffIcon(SIZE), "video-off-icon"),
                new FeatherIconView("Voicemail", new VoicemailIcon(SIZE), "voicemail-icon"),
                new FeatherIconView("Volume", new VolumeIcon(SIZE), "volume-icon"),
                new FeatherIconView("Volume-1", new Volume1Icon(SIZE), "volume-1-icon"),
                new FeatherIconView("Volume-2", new Volume2Icon(SIZE), "volume-2-icon"),
                new FeatherIconView("Volume-X", new VolumeXIcon(SIZE), "volume-x-icon"),
                new FeatherIconView("Watch", new WatchIcon(SIZE), "watch-icon"),
                new FeatherIconView("Wifi", new WifiIcon(SIZE), "wifi-icon"),
                new FeatherIconView("Wifi Off", new WifiOffIcon(SIZE), "wifi-off-icon"),
                new FeatherIconView("Wind", new WindIcon(SIZE), "wind-icon"),
                new FeatherIconView("X", new XIcon(SIZE), "x-icon"),
                new FeatherIconView("X-Circle", new XCircleIcon(SIZE), "x-circle-icon"),
                new FeatherIconView("X-Octagon", new XOctagonIcon(SIZE), "x-octagon-icon"),
                new FeatherIconView("X-Square", new XSquareIcon(SIZE), "x-square-icon"),
                new FeatherIconView("Youtube", new YoutubeIcon(SIZE), "youtube-icon"),
                new FeatherIconView("Zap", new ZapIcon(SIZE), "zap-icon"),
                new FeatherIconView("Zap Off", new ZapOffIcon(SIZE), "zap-off-icon"),
                new FeatherIconView("Zoom In", new ZoomInIcon(SIZE), "zoom-in-icon"),
                new FeatherIconView("Zoom Out", new ZoomOutIcon(SIZE), "zoom-out-icon")
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
