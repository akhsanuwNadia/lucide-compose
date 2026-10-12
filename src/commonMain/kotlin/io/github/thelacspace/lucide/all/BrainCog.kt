package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrainCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.852f,14.772f)
                lineTo(10.469f,15.695001f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.852f,9.228f)
                lineTo(10.469f,8.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f,14.772f)
                lineTo(13.53f,15.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.531f,8.305f)
                lineTo(13.148f,9.228001f)
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
                moveTo(17.598f,6.5f)
                curveTo(18.22867f,5.407775f,18.108854f,4.0377226f,17.29817f,3.071549f)
                curveTo(16.487486f,2.1053748f,15.159068f,1.7494214f,13.973905f,2.180802f)
                curveTo(12.788741f,2.612183f,11.999944f,3.73877f,12.0f,5.0f)
                curveTo(12.001237f,3.629572f,11.073643f,2.4325142f,9.746294f,2.0916002f)
                curveTo(8.418946f,1.7506864f,7.0293097f,2.3525903f,6.37f,3.554f)
                curveTo(6.1061673f,4.0342336f,5.978897f,4.577553f,6.002f,5.125f)
                curveTo(4.810869f,5.431401f,3.8269145f,6.2687345f,3.3339136f,7.39551f)
                curveTo(2.8409123f,8.522286f,2.8936808f,9.81322f,3.4769998f,10.896f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.998f,5.125f)
                curveTo(19.18913f,5.431401f,20.173084f,6.2687345f,20.666086f,7.39551f)
                curveTo(21.159086f,8.522286f,21.106318f,9.81322f,20.522999f,10.896f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.505f,10.294f)
                curveTo(21.27695f,11.013667f,22.291557f,12.886987f,21.926136f,14.764273f)
                curveTo(21.560717f,16.64156f,19.917519f,17.997528f,18.005f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.032f,17.483f)
                curveTo(3.7837553f,19.375439f,4.9071374f,21.179628f,6.7149277f,21.791874f)
                curveTo(8.522717f,22.40412f,10.511226f,21.653835f,11.464f,20.0f)
                curveTo(11.644f,19.689f,12.356f,19.689f,12.535999f,20.0f)
                curveTo(13.48876f,21.653486f,15.476873f,22.403662f,17.284445f,21.791735f)
                curveTo(19.092014f,21.179806f,20.215586f,19.376211f,19.967999f,17.484f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,10.291f)
                curveTo(2.7239316f,11.008213f,1.7055712f,12.88383f,2.0714073f,14.763984f)
                curveTo(2.4372435f,16.644138f,4.0845857f,18.001068f,6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.002f,5.125f)
                curveTo(6.0223856f,5.6089025f,6.159629f,6.080675f,6.402f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,10.852f)
                lineTo(8.304999f,10.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,13.148f)
                lineTo(8.304999f,13.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
}

public val LucideIcons.All.BrainCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrainCog: ImageVector
    @Composable get() = BrainCogDefinition.asImageVector()
