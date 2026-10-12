package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SprayCan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.009999990463257,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,5.0)
                lineTo(7.010000228881836,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,7.0)
                lineTo(11.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.009999990463257,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                lineTo(7.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(3.009999990463257,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(19.0,5.0)
                lineTo(19.0,9.0)
                lineTo(15.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(21.0,11.0)
                lineTo(21.0,21.0)
                curveTo(21.0,21.600000381469727,20.600000381469727,22.0,20.0,22.0)
                lineTo(14.0,22.0)
                curveTo(13.399999618530273,22.0,13.0,21.600000381469727,13.0,21.0)
                lineTo(13.0,11.0)
                lineTo(15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,14.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                lineTo(21.0,17.0)
            }
}

public val LucideIcons.All.SprayCanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SprayCan: ImageVector
    @Composable get() = SprayCanDefinition.asImageVector()
