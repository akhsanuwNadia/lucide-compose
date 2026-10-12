package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandCoins") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,15.0f)
                lineTo(13.0f,15.0f)
                curveTo(13.716661f,15.003205f,14.38026f,14.622709f,14.73952f,14.002591f)
                curveTo(15.098779f,13.382472f,15.098779f,12.617528f,14.73952f,11.997409f)
                curveTo(14.38026f,11.377291f,13.716661f,10.996795f,13.0f,11.0f)
                lineTo(10.0f,11.0f)
                curveTo(9.4f,11.0f,8.9f,11.2f,8.6f,11.6f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(8.6f,19.6f)
                curveTo(8.900001f,19.2f,9.400001f,19.0f,10.0f,19.0f)
                lineTo(14.0f,19.0f)
                curveTo(15.1f,19.0f,16.1f,18.6f,16.8f,17.8f)
                lineTo(21.4f,13.4f)
                curveTo(22.197649f,12.639426f,22.230505f,11.377177f,21.473507f,10.576135f)
                curveTo(20.716509f,9.775093f,19.45442f,9.736591f,18.65f,10.49f)
                lineTo(14.45f,14.389999f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(8.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.1f,9.0f)
                curveTo(13.095353f,10.03916f,13.647072f,11.001378f,14.546244f,11.522305f)
                curveTo(15.445416f,12.04323f,16.554586f,12.04323f,17.453758f,11.522305f)
                curveTo(18.35293f,11.001378f,18.90465f,10.03916f,18.900002f,9.0f)
                curveTo(18.90465f,7.96084f,18.35293f,6.9986224f,17.453758f,6.4776964f)
                curveTo(16.554586f,5.95677f,15.445416f,5.95677f,14.546245f,6.4776964f)
                curveTo(13.647073f,6.9986224f,13.095354f,7.96084f,13.100001f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                curveTo(2.9951925f,6.0749927f,3.5659356f,7.0703907f,4.496114f,7.6092796f)
                curveTo(5.426292f,8.148169f,6.573708f,8.148169f,7.503886f,7.6092796f)
                curveTo(8.434065f,7.0703907f,9.004807f,6.0749927f,9.0f,5.0f)
                curveTo(9.004807f,3.925007f,8.434065f,2.9296093f,7.503886f,2.3907204f)
                curveTo(6.573708f,1.8518313f,5.426292f,1.8518313f,4.496114f,2.3907204f)
                curveTo(3.5659356f,2.9296093f,2.9951925f,3.925007f,3.0f,5.0f)
            }
}

public val LucideIcons.All.HandCoinsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandCoins: ImageVector
    @Composable get() = HandCoinsDefinition.asImageVector()
