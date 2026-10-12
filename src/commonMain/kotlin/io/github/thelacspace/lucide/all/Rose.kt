package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rose") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,10.0f)
                lineTo(16.0f,10.0f)
                curveTo(13.790861f,10.0f,12.0f,8.209139f,12.0f,6.0f)
                curveTo(12.0f,3.790861f,13.790861f,2.0f,16.0f,2.0f)
                curveTo(18.209139f,2.0f,20.0f,3.790861f,20.0f,6.0f)
                lineTo(20.0f,6.534f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                lineTo(18.0f,6.0f)
                curveTo(19.931276f,5.9993196f,21.587246f,7.3786244f,21.935745f,9.278196f)
                curveTo(22.284246f,11.177769f,21.225742f,13.055078f,19.42f,13.74f)
                lineTo(17.130001f,14.61f)
                curveTo(14.249607f,15.706246f,11.007129f,14.44196f,9.629045f,11.685275f)
                curveTo(8.25096f,8.928591f,9.18552f,5.5761766f,11.791f,3.9299994f)
                lineTo(13.860001f,2.6199994f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,17.0f)
                curveTo(7.3f,16.5f,8.9f,17.0f,10.0f,17.8f)
                curveTo(11.1f,18.599998f,11.8f,20.0f,12.3f,21.5f)
                curveTo(10.3f,21.9f,8.8f,21.9f,7.5f,21.2f)
                curveTo(6.3f,20.6f,5.2f,19.300001f,4.5f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.77f,12.0f)
                curveTo(4.0f,15.0f,2.0f,22.0f,2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                curveTo(14.996795f,8.716661f,15.377291f,9.38026f,15.997409f,9.73952f)
                curveTo(16.617527f,10.098779f,17.382473f,10.098779f,18.00259f,9.73952f)
                curveTo(18.62271f,9.38026f,19.003204f,8.716661f,19.0f,8.0f)
                curveTo(19.003204f,7.283338f,18.62271f,6.6197395f,18.00259f,6.2604804f)
                curveTo(17.382473f,5.901221f,16.617527f,5.901221f,15.997409f,6.2604804f)
                curveTo(15.377291f,6.6197395f,14.996795f,7.283338f,15.0f,8.0f)
            }
}

public val LucideIcons.All.RoseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rose: ImageVector
    @Composable get() = RoseDefinition.asImageVector()
