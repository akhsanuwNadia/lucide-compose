package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DraftingCompass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.99f,6.74f)
                lineTo(14.92f,10.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.136f,12.0f)
                curveTo(17.255648f,13.915097f,14.684401f,14.993957f,12.0005f,14.993957f)
                curveTo(9.316599f,14.993957f,6.745352f,13.915097f,4.865f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(18.84f,17.16f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(11.02f,6.74f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                curveTo(9.996795f,5.716662f,10.377291f,6.3802605f,10.997409f,6.7395196f)
                curveTo(11.617528f,7.098779f,12.382472f,7.098779f,13.002591f,6.7395196f)
                curveTo(13.622709f,6.3802605f,14.003205f,5.716662f,14.0f,5.0f)
                curveTo(14.003205f,4.283338f,13.622709f,3.6197395f,13.002591f,3.2604802f)
                curveTo(12.382472f,2.9012208f,11.617528f,2.9012208f,10.997409f,3.2604802f)
                curveTo(10.377291f,3.6197395f,9.996795f,4.283338f,10.0f,5.0f)
            }
}

public val LucideIcons.All.DraftingCompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DraftingCompass: ImageVector
    @Composable get() = DraftingCompassDefinition.asImageVector()
