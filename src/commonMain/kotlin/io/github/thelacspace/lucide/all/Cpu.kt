package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cpu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,20.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(17.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                lineTo(4.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,7.0f)
                lineTo(4.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,7.0f)
                lineTo(22.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(7.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(18.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(20.0f,20.0f)
                lineTo(18.0f,20.0f)
                lineTo(6.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(4.0f,4.0f)
                lineTo(6.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,8.0f)
                lineTo(15.0f,8.0f)
                lineTo(16.0f,8.0f)
                lineTo(16.0f,16.0f)
                lineTo(15.0f,16.0f)
                lineTo(9.0f,16.0f)
                lineTo(8.0f,16.0f)
                lineTo(8.0f,8.0f)
                lineTo(9.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.CpuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cpu: ImageVector
    @Composable get() = CpuDefinition.asImageVector()
