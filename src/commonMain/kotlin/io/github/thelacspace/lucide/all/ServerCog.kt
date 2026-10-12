package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.852f,14.772f)
                lineTo(10.469f,15.695001f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f,14.772f)
                curveTo(14.143133f,14.365078f,14.844476f,13.456806f,14.986461f,12.391107f)
                curveTo(15.128447f,11.325407f,14.689368f,10.265195f,13.835486f,9.611925f)
                curveTo(12.981605f,8.958655f,11.843453f,8.812195f,10.851999f,9.228001f)
                lineTo(10.468999f,8.305f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f,9.228f)
                lineTo(13.531f,8.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.53f,15.696f)
                lineTo(13.148f,14.772f)
                curveTo(12.156546f,15.187806f,11.018394f,15.041346f,10.164513f,14.388076f)
                curveTo(9.310631f,13.734806f,8.871552f,12.674594f,9.013538f,11.608894f)
                curveTo(9.155523f,10.543195f,9.856866f,9.634923f,10.851999f,9.228001f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772f,10.852f)
                lineTo(15.695001f,10.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772f,13.148f)
                lineTo(15.695001f,13.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(20.0f,2.0f)
                curveTo(21.10457f,2.0f,22.0f,2.8954306f,22.0f,4.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,9.104569f,21.10457f,10.0f,20.0f,10.0f)
                lineTo(19.5f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,14.0f)
                lineTo(4.0f,14.0f)
                curveTo(2.8954306f,14.0f,2.0f,14.895431f,2.0f,16.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,21.10457f,2.8954306f,22.0f,4.0f,22.0f)
                lineTo(20.0f,22.0f)
                curveTo(21.10457f,22.0f,22.0f,21.10457f,22.0f,20.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,14.895431f,21.10457f,14.0f,20.0f,14.0f)
                lineTo(19.5f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,10.852f)
                lineTo(8.304999f,10.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,13.148f)
                lineTo(8.304999f,13.531f)
            }
}

public val LucideIcons.All.ServerCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerCog: ImageVector
    @Composable get() = ServerCogDefinition.asImageVector()
