package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5f,12.5f)
                lineTo(20.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5f,12.5f)
                lineTo(15.5f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.955f,8.774f)
                curveTo(21.67275f,6.6456795f,20.177868f,4.876146f,18.126627f,4.242251f)
                curveTo(16.075386f,3.608356f,13.842797f,4.2259893f,12.409f,5.8240004f)
                curveTo(12.178586f,6.03867f,11.821415f,6.03867f,11.591001f,5.8240004f)
                curveTo(10.06839f,4.129542f,7.658774f,3.5491076f,5.531609f,4.3643985f)
                curveTo(3.4044437f,5.17969f,2.0000417f,7.221946f,2.0f,9.5f)
                curveTo(2.0f,11.8f,3.5f,13.5f,5.0f,15.0f)
                lineTo(10.507999f,20.332f)
                curveTo(11.162113f,21.064293f,12.251072f,21.213442f,13.077999f,20.684f)
            }
}

public val LucideIcons.All.HeartXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartX: ImageVector
    @Composable get() = HeartXDefinition.asImageVector()
