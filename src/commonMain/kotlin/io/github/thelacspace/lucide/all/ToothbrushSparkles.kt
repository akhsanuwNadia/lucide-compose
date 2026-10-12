package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToothbrushSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(8.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.586f,11.414f)
                lineTo(22.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,11.0f)
                curveTo(14.8619375f,11.138533f,14.718842f,11.2719555f,14.571f,11.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(9.0f,15.0f)
                curveTo(10.857f,13.143f,12.714f,13.01f,14.571f,11.4f)
                lineTo(12.586f,9.414f)
                curveTo(12.014185f,8.842011f,11.843157f,7.9819264f,12.152645f,7.234691f)
                curveTo(12.462132f,6.4874554f,13.191209f,6.000173f,14.0f,6.0f)
                curveTo(14.0f,4.8954306f,14.895431f,4.0f,16.0f,4.0f)
                curveTo(15.999832f,3.2281854f,16.443783f,2.5251539f,17.140736f,2.1935573f)
                curveTo(17.837687f,1.8619604f,18.66324f,1.9609845f,19.262001f,2.448f)
                lineTo(21.414001f,4.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(20.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,7.0f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,4.0f)
            }
}

public val LucideIcons.All.ToothbrushSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToothbrushSparkles: ImageVector
    @Composable get() = ToothbrushSparklesDefinition.asImageVector()
