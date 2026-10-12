package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,21.0)
                lineTo(10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                curveTo(8.348382949829102,9.007386207580566,7.013386249542236,10.348365783691406,7.013386249542236,12.0)
                curveTo(7.013386249542236,13.651634216308594,8.348382949829102,14.992613792419434,10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(15.25,17.5)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(15.25,6.5)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(14.0,15.0)
                lineTo(15.5,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(14.0,9.0)
                lineTo(15.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(18.5,12.0)
                lineTo(20.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.640000104904175,18.360000610351562)
                lineTo(4.340000152587891,17.65999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(4.340000152587891,6.340000152587891)
                lineTo(3.640000104904175,5.640000343322754)
            }
}

public val LucideIcons.All.SunSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunSnow: ImageVector
    @Composable get() = SunSnowDefinition.asImageVector()
