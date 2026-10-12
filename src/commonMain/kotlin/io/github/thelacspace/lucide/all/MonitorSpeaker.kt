package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorSpeaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.5,20.0)
                lineTo(8.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,9.0)
                lineTo(17.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(14.0,20.0)
                lineTo(12.0,20.0)
                lineTo(12.0,4.0)
                lineTo(14.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(4.0,6.0)
                curveTo(2.895430564880371,6.0,2.0,6.895430564880371,2.0,8.0)
                lineTo(2.0,14.0)
                curveTo(2.0,15.104569435119629,2.895430564880371,16.0,4.0,16.0)
                lineTo(8.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,15.0)
                curveTo(15.998397827148438,15.358330726623535,16.188644409179688,15.690130233764648,16.49870491027832,15.869759559631348)
                curveTo(16.80876350402832,16.049388885498047,17.19123649597168,16.049388885498047,17.50129508972168,15.869759559631348)
                curveTo(17.811355590820312,15.690130233764648,18.001602172851562,15.358330726623535,18.0,15.0)
                curveTo(18.001602172851562,14.641669273376465,17.811355590820312,14.309869766235352,17.50129508972168,14.130240440368652)
                curveTo(17.19123649597168,13.950610160827637,16.80876350402832,13.950610160827637,16.49870491027832,14.130240440368652)
                curveTo(16.188644409179688,14.309869766235352,15.998397827148438,14.641669273376465,16.0,15.0)
            }
}

public val LucideIcons.All.MonitorSpeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorSpeaker: ImageVector
    @Composable get() = MonitorSpeakerDefinition.asImageVector()
