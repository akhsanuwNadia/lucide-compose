package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anchor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,13.0f)
                lineTo(21.0f,12.0f)
                curveTo(20.97784f,16.954851f,16.9549f,20.95984f,12.0f,20.95984f)
                curveTo(7.045099f,20.95984f,3.0221589f,16.954851f,3.0f,12.0f)
                lineTo(5.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(15.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                curveTo(9.996795f,4.716662f,10.377291f,5.3802605f,10.997409f,5.7395196f)
                curveTo(11.617528f,6.098779f,12.382472f,6.098779f,13.002591f,5.7395196f)
                curveTo(13.622709f,5.3802605f,14.003205f,4.716662f,14.0f,4.0f)
                curveTo(14.003205f,3.283338f,13.622709f,2.6197395f,13.002591f,2.2604802f)
                curveTo(12.382472f,1.9012209f,11.617528f,1.9012209f,10.997409f,2.2604802f)
                curveTo(10.377291f,2.6197395f,9.996795f,3.283338f,10.0f,4.0f)
            }
}

public val LucideIcons.All.AnchorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anchor: ImageVector
    @Composable get() = AnchorDefinition.asImageVector()
