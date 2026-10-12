package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Snowflake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
                lineTo(8.75,17.5)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(8.75,6.5)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(15.25,17.5)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(15.25,6.5)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(14.0,15.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(14.0,9.0)
                lineTo(15.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(8.5,12.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(18.5,12.0)
                lineTo(20.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(15.5,12.0)
                lineTo(14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(5.5,12.0)
                lineTo(4.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(10.0,15.0)
                lineTo(8.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(10.0,9.0)
                lineTo(14.0,9.0)
            }
}

public val LucideIcons.All.SnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Snowflake: ImageVector
    @Composable get() = SnowflakeDefinition.asImageVector()
