package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(13.5,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(13.5,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(13.5,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,22.0)
                lineTo(19.0,22.0)
                curveTo(19.552284240722656,22.0,20.0,21.552284240722656,20.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,2.0)
                lineTo(19.0,2.0)
                curveTo(19.552284240722656,2.0,20.0,2.4477152824401855,20.0,3.0)
                lineTo(20.0,4.5)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.0)
                lineTo(20.0,17.0)
                lineTo(17.5,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.5)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(4.0,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,19.5)
                lineTo(4.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.5)
                curveTo(4.0,3.119288206100464,5.119287967681885,2.0,6.5,2.0)
                lineTo(8.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(6.5,22.0)
                curveTo(5.123652458190918,21.993844985961914,4.011155605316162,20.876361846923828,4.011155605316162,19.5)
                curveTo(4.011155605316162,18.123638153076172,5.123652458190918,17.006155014038086,6.5,17.0)
                lineTo(8.0,17.0)
            }
}

public val LucideIcons.All.BookDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookDashed: ImageVector
    @Composable get() = BookDashedDefinition.asImageVector()
