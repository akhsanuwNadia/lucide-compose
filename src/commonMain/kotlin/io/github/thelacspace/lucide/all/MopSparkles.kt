package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MopSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                curveTo(8.343145f,22.0f,7.0f,20.656855f,7.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                curveTo(12.761f,22.0f,15.0f,20.21f,15.0f,18.0f)
                curveTo(10.58f,18.0f,10.92f,13.0f,6.5f,13.0f)
                curveTo(4.051682f,13.051616f,2.0938702f,15.051138f,2.0938702f,17.5f)
                curveTo(2.0938702f,19.948862f,4.051682f,21.948383f,6.5f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(8.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f,11.5f)
                lineTo(22.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,15.0f)
                lineTo(18.0f,15.0f)
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
                moveTo(6.98f,13.02f)
                lineTo(9.645f,10.356001f)
                curveTo(10.117397f,9.884265f,10.882604f,9.884265f,11.3550005f,10.356001f)
                lineTo(13.645f,12.644001f)
                curveTo(13.872165f,12.870953f,13.999803f,13.178892f,13.999803f,13.500001f)
                curveTo(13.999803f,13.82111f,13.872165f,14.129049f,13.645f,14.356001f)
                lineTo(11.557f,16.443f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,4.0f)
            }
}

public val LucideIcons.All.MopSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MopSparkles: ImageVector
    @Composable get() = MopSparklesDefinition.asImageVector()
