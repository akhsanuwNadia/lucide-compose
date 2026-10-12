package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TentTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,4.0f)
                curveTo(1.9967949f,4.716662f,2.3772902f,5.3802605f,2.997409f,5.7395196f)
                curveTo(3.617528f,6.098779f,4.382472f,6.098779f,5.0025907f,5.7395196f)
                curveTo(5.6227098f,5.3802605f,6.003205f,4.716662f,6.0f,4.0f)
                curveTo(6.003205f,3.283338f,5.6227098f,2.6197395f,5.0025907f,2.2604802f)
                curveTo(4.382472f,1.9012209f,3.617528f,1.9012209f,2.997409f,2.2604802f)
                curveTo(2.3772902f,2.6197395f,1.9967949f,3.283338f,2.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(17.0f,2.0f)
                lineTo(20.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(17.0f,7.0f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(7.0f,14.0f)
                lineTo(2.0f,22.0f)
                lineTo(22.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.0f)
                lineTo(14.0f,22.0f)
            }
}

public val LucideIcons.All.TentTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TentTree: ImageVector
    @Composable get() = TentTreeDefinition.asImageVector()
