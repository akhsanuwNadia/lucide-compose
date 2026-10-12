package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(7.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.264f,9.252f)
                lineTo(12.0f,12.0f)
                lineTo(16.737f,9.252f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.995f,8.514f)
                curveTo(7.3787556f,8.872167f,6.9996986f,9.531231f,7.0f,10.244f)
                lineTo(7.0f,13.76f)
                curveTo(6.9999056f,14.472975f,7.379371f,15.132087f,7.996f,15.49f)
                lineTo(10.996f,17.23f)
                curveTo(11.616832f,17.590353f,12.383168f,17.590353f,13.004f,17.23f)
                lineTo(16.004f,15.49f)
                curveTo(16.620628f,15.132087f,17.000093f,14.472975f,17.0f,13.76f)
                lineTo(17.0f,10.243f)
                curveTo(17.000301f,9.5302305f,16.621243f,8.871166f,16.005f,8.5130005f)
                lineTo(13.004999f,6.7710004f)
                curveTo(12.424996f,6.433645f,11.714473f,6.4096103f,11.112999f,6.7070003f)
                close()
            }
}

public val LucideIcons.All.ScanBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanBox: ImageVector
    @Composable get() = ScanBoxDefinition.asImageVector()
