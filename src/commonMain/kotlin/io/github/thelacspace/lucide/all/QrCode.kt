package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("QrCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(7.0,3.0)
                lineTo(8.0,3.0)
                lineTo(8.0,8.0)
                lineTo(7.0,8.0)
                lineTo(4.0,8.0)
                lineTo(3.0,8.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(20.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,8.0)
                lineTo(20.0,8.0)
                lineTo(17.0,8.0)
                lineTo(16.0,8.0)
                lineTo(16.0,3.0)
                lineTo(17.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                lineTo(7.0,16.0)
                lineTo(8.0,16.0)
                lineTo(8.0,21.0)
                lineTo(7.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,16.0)
                lineTo(4.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(18.0,16.0)
                curveTo(16.895429611206055,16.0,16.0,16.895429611206055,16.0,18.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(21.0,21.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,10.0)
                curveTo(12.0,11.104569435119629,11.104569435119629,12.0,10.0,12.0)
                lineTo(7.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(3.009999990463257,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.010000228881836,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,16.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(17.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(21.0,12.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,21.0)
                lineTo(12.0,20.0)
            }
}

public val LucideIcons.All.QrCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.QrCode: ImageVector
    @Composable get() = QrCodeDefinition.asImageVector()
