package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Snowflake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(8.75f,17.5f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(8.75f,6.5f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(15.25f,17.5f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(15.25f,6.5f)
                lineTo(18.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(14.0f,15.0f)
                lineTo(10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(14.0f,9.0f)
                lineTo(15.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(8.5f,12.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(18.5f,12.0f)
                lineTo(20.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(15.5f,12.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                lineTo(5.5f,12.0f)
                lineTo(4.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(10.0f,15.0f)
                lineTo(8.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(10.0f,9.0f)
                lineTo(14.0f,9.0f)
            }
}

public val LucideIcons.All.SnowflakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Snowflake: ImageVector
    @Composable get() = SnowflakeDefinition.asImageVector()
