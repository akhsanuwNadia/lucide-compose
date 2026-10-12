package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cpu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(17.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                lineTo(4.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,7.0)
                lineTo(4.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,7.0)
                lineTo(22.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(7.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(18.0,4.0)
                lineTo(20.0,4.0)
                lineTo(20.0,20.0)
                lineTo(18.0,20.0)
                lineTo(6.0,20.0)
                lineTo(4.0,20.0)
                lineTo(4.0,4.0)
                lineTo(6.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,8.0)
                lineTo(15.0,8.0)
                lineTo(16.0,8.0)
                lineTo(16.0,16.0)
                lineTo(15.0,16.0)
                lineTo(9.0,16.0)
                lineTo(8.0,16.0)
                lineTo(8.0,8.0)
                lineTo(9.0,8.0)
                close()
            }
}

public val LucideIcons.All.CpuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cpu: ImageVector
    @Composable get() = CpuDefinition.asImageVector()
