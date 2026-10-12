package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Banknote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,18.0f)
                lineTo(20.0f,18.0f)
                lineTo(4.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(2.0f,6.0f)
                lineTo(4.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(6.01f,12.0f)
                moveTo(18.0f,12.0f)
                lineTo(18.01f,12.0f)
            }
}

public val LucideIcons.All.BanknoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Banknote: ImageVector
    @Composable get() = BanknoteDefinition.asImageVector()
