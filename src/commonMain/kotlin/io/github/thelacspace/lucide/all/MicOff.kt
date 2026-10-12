package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.34f)
                lineTo(15.0f,5.0f)
                curveTo(14.991646f,3.6134129f,14.034114f,2.4132147f,12.684019f,2.0970836f)
                curveTo(11.333924f,1.7809522f,9.943086f,2.4312677f,9.32f,3.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.95f,16.95f)
                curveTo(14.948006f,18.9522f,11.937002f,19.55119f,9.321147f,18.467634f)
                curveTo(6.7052927f,17.38408f,4.999795f,14.831393f,5.0f,12.0f)
                lineTo(5.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.89f,13.23f)
                curveTo(18.96283f,12.824041f,18.999641f,12.41244f,19.0f,12.0f)
                lineTo(19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                lineTo(9.0f,12.0f)
                curveTo(9.001066f,13.212566f,9.73198f,14.305263f,10.852306f,14.769148f)
                curveTo(11.972631f,15.233032f,13.262053f,14.976881f,14.12f,14.12f)
            }
}

public val LucideIcons.All.MicOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicOff: ImageVector
    @Composable get() = MicOffDefinition.asImageVector()
