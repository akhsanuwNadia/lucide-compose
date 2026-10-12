package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceSlightlySmilingPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.267000198364258,2.0799999237060547)
                curveTo(9.024554252624512,1.5383421182632446,4.907276630401611,3.754624605178833,3.0231635570526123,7.594136714935303)
                curveTo(1.1390504837036133,11.433649063110352,1.9052410125732422,16.04633140563965,4.929454803466797,19.070545196533203)
                curveTo(7.953668594360352,22.094758987426758,12.566350936889648,22.86094856262207,16.40586280822754,20.976837158203125)
                curveTo(20.24537467956543,19.092723846435547,22.461658477783203,14.975445747375488,21.920000076293945,10.732999801635742)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.472000122070312,15.0)
                curveTo(15.333769798278809,16.272172927856445,13.707541465759277,16.99928855895996,12.000499725341797,16.99928855895996)
                curveTo(10.293458938598633,16.99928855895996,8.667230606079102,16.272172927856445,7.529000282287598,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                lineTo(19.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(9.0,9.0)
            }
}

public val LucideIcons.All.FaceSlightlySmilingPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceSlightlySmilingPlus: ImageVector
    @Composable get() = FaceSlightlySmilingPlusDefinition.asImageVector()
