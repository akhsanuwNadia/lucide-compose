package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScissorsLineDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.42f,9.42f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                curveTo(1.9967949f,8.716661f,2.3772902f,9.38026f,2.997409f,9.73952f)
                curveTo(3.617528f,10.098779f,4.382472f,10.098779f,5.0025907f,9.73952f)
                curveTo(5.6227098f,9.38026f,6.003205f,8.716661f,6.0f,8.0f)
                curveTo(6.003205f,7.283338f,5.6227098f,6.6197395f,5.0025907f,6.2604804f)
                curveTo(4.382472f,5.901221f,3.617528f,5.901221f,2.997409f,6.2604804f)
                curveTo(2.3772902f,6.6197395f,1.9967949f,7.283338f,2.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(5.42f,14.58f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                curveTo(1.9967949f,16.716661f,2.3772902f,17.38026f,2.997409f,17.73952f)
                curveTo(3.617528f,18.09878f,4.382472f,18.09878f,5.0025907f,17.73952f)
                curveTo(5.6227098f,17.38026f,6.003205f,16.716661f,6.0f,16.0f)
                curveTo(6.003205f,15.283339f,5.6227098f,14.61974f,5.0025907f,14.26048f)
                curveTo(4.382472f,13.901221f,3.617528f,13.901221f,2.997409f,14.26048f)
                curveTo(2.3772902f,14.61974f,1.9967949f,15.283339f,2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.8f,14.8f)
                lineTo(14.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
}

public val LucideIcons.All.ScissorsLineDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScissorsLineDashed: ImageVector
    @Composable get() = ScissorsLineDashedDefinition.asImageVector()
