package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PrinterX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.531f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(6.4477153f,22.0f,6.0f,21.552284f,6.0f,21.0f)
                lineTo(6.0f,15.0f)
                curveTo(6.0f,14.447715f,6.4477153f,14.0f,7.0f,14.0f)
                lineTo(13.377f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,16.5f)
                lineTo(21.5f,21.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,21.5f)
                lineTo(21.5f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(4.0f,18.0f)
                curveTo(2.8954306f,18.0f,2.0f,17.10457f,2.0f,16.0f)
                lineTo(2.0f,11.0f)
                curveTo(2.0f,9.895431f,2.8954306f,9.0f,4.0f,9.0f)
                lineTo(20.0f,9.0f)
                curveTo(21.10457f,9.0f,22.0f,9.895431f,22.0f,11.0f)
                lineTo(22.0f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                lineTo(6.0f,3.0f)
                curveTo(6.0f,2.4477153f,6.4477153f,2.0f,7.0f,2.0f)
                lineTo(17.0f,2.0f)
                curveTo(17.552284f,2.0f,18.0f,2.4477153f,18.0f,3.0f)
                lineTo(18.0f,9.0f)
            }
}

public val LucideIcons.All.PrinterXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PrinterX: ImageVector
    @Composable get() = PrinterXDefinition.asImageVector()
