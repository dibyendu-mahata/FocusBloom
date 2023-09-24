package com.joelkanyi.focusbloom.core.presentation.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.joelkanyi.focusbloom.feature.calendar.CalendarScreen
import com.joelkanyi.focusbloom.feature.home.HomeScreen
import com.joelkanyi.focusbloom.feature.settings.SettingsScreen
import com.joelkanyi.focusbloom.feature.statistics.StatisticsScreen
import com.joelkanyi.focusbloom.feature.addtask.AddTaskScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

internal sealed class BloomTab {
    internal object HomeTab : Tab {
        @OptIn(ExperimentalResourceApi::class)
        override val options: TabOptions
            @Composable
            get() {
                val title = "Home"
                val icon = painterResource("home_outlined.xml")

                return remember {
                    TabOptions(
                        index = 0u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            HomeScreen()
        }
    }

    internal object CalendarTab : Tab {
        @OptIn(ExperimentalResourceApi::class)
        override val options: TabOptions
            @Composable
            get() {
                val title = "Calendar"
                val icon = painterResource("calendar_outlined.xml")

                return remember {
                    TabOptions(
                        index = 1u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            CalendarScreen()
        }
    }

    internal object StatisticsTab : Tab {
        @OptIn(ExperimentalResourceApi::class)
        override val options: TabOptions
            @Composable
            get() {
                val title = "Statistics"
                val icon = painterResource("statistics_outlined.xml")

                return remember {
                    TabOptions(
                        index = 2u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            StatisticsScreen()
        }
    }

    internal object SettingsTab : Tab {
        @OptIn(ExperimentalResourceApi::class)
        override val options: TabOptions
            @Composable
            get() {
                val title = "Settings"
                val icon = painterResource("settings_outlined.xml")

                return remember {
                    TabOptions(
                        index = 3u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            SettingsScreen()
        }
    }

    internal object AddTaskTab : Tab {
        @OptIn(ExperimentalResourceApi::class)
        override val options: TabOptions
            @Composable
            get() {
                val title = "Add Task"
                val icon = painterResource("add_outlined.xml")

                return remember {
                    TabOptions(
                        index = 4u,
                        title = title,
                        icon = icon,
                    )
                }
            }

        @Composable
        override fun Content() {
            AddTaskScreen()
        }
    }
}
